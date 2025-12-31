package Contests;

class HighSchoolLockers
{
    public static int closedLockers(int n, int m)
    {
        int[] arr = new int[n];
        int len = n/m;
        int count=0;


        for(int i=1; i<=len; i++)
        {
            arr[(2*i)-1]++;
        }

        for(int x:arr){
           if(x==0)
               count++;
        }

        return count;

    }
}

public class CountingLockers {
    public static void main(String[] args) {
        int count_req = HighSchoolLockers.closedLockers(12,3);
        System.out.println("Closed Lockers "+count_req);

    }
}
