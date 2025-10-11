import java.util.Random;

class Channel {
    private boolean busy = false;
    private int transmittingNodes = 0; // Count nodes transmitting at the same time

    public synchronized boolean tryToSend(String nodeName) {
        transmittingNodes++;
        if (transmittingNodes > 1) {
            // More than one node -> collision
            System.out.println(nodeName + " COLLISION detected!");
            return false;
        }
        busy = true;
        System.out.println(nodeName + " started transmitting...");
        return true;
    }

    public synchronized void finishSend(String nodeName) {
        transmittingNodes--;
        if (transmittingNodes == 0) {
            busy = false;
        }
        System.out.println(nodeName + " finished transmission.");
    }

    public synchronized boolean isBusy() {
        return busy;
    }
}

class Node extends Thread {
    private Channel channel;
    private String name;
    private Random rand = new Random();

    public Node(Channel channel, String name) {
        this.channel = channel;
        this.name = name;
    }

    @Override
    public void run() {
        int attempts = 0;
        while (true) {
            try {
                // Sense the channel
                if (!channel.isBusy()) {
                    boolean success = channel.tryToSend(name);

                    if (success) {
                        // Simulate transmission time
                        Thread.sleep(500);
                        channel.finishSend(name);
                        break;
                    } else {
                        // Collision -> Backoff
                        attempts++;
                        int backoffTime = rand.nextInt((int) Math.pow(2, attempts)) * 200;
                        System.out.println(name + " backing off for " + backoffTime + "ms...");
                        Thread.sleep(backoffTime);
                    }
                } else {
                    // Channel busy, wait and retry
                    Thread.sleep(100);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class CSMACDSimulation {
    public static void main(String[] args) {
        Channel channel = new Channel();

        Node n1 = new Node(channel, "Node1");
        Node n2 = new Node(channel, "Node2");
        Node n3 = new Node(channel, "Node3");

        n1.start();
        n2.start();
        n3.start();
    }
}
