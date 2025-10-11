package GFG.pracrise.Loops;

public class Inf_loopFUN {
    public static void main(String[] args) {
        int n = 5;
        int nxt = n+1;

            for(int i=nxt; i<=nxt; i++)
            {
                    if(nxt==100){
                        System.out.format("value of n = %d, value of next = %d \n",n,nxt);
                        System.out.println("reached value");
                        break; }
                System.out.format("value of n = %d, value of next = %d \n",n,nxt);
                nxt +=1;

            }
    }
}
