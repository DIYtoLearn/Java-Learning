package CollectionsKNOWLEDGE.Queue;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class BreathFirstSearch{

    static void BFSImplementationForBinaryNumberGeneration(int Number)
    {
        Queue<String> queue = new LinkedList<>();
        List<String> list = new ArrayList<>();

        queue.add("1");

        for(int i=0; i<Number; i++)
        {
            String current = queue.poll();
            list.add(current);

            queue.add(current+"0");
            queue.add(current+"1");
        }

        System.out.println("List containing Binary Number "+list);

    }
}


public class GenerateBinaryNumbers {
    static void main() {

        BreathFirstSearch.BFSImplementationForBinaryNumberGeneration(9999);

    }
}
