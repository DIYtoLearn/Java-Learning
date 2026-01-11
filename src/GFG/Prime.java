package GFG;
// This solution is bull shit
// it should find the next prime number even if I enter a prime number or an even number
public class Prime{
    public static void main(String[] args)
    {
         // Print the next prime number. if input = 5 then output = 7
        int n = 5;
        int nxt = n+1;
        int chk = 0;
        for(int i=nxt; i<=nxt; i++)
        {
            for(int j=2; j<= Math.sqrt(nxt); j++)
            {
                if(nxt%j==0) {
                    System.out.format("Running for nxt = %d and j = %d and i = %d\n",nxt,j,i);
//                    chk++;
                    break;
                }
                else
                    chk++;
            }
            nxt++;
            if(chk==0){
                System.out.println(nxt);
                break;
            }
        }
    }
}