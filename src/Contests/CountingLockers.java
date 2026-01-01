package Contests;

class HighSchoolLockers
{
    public static int closedLockers(int n, int m)
    {
        int[] arr = new int[n];
        int len;

        if(m==0)
            return n;
        else
            len = n/m;

        int count=0;

        for(int i=1; i<=len; i++)
        {
            arr[(m*i)-1]++;
            count++;
        }

        return (n-count);

    }
}

public class CountingLockers {
    public static void main(String[] args) {
        int count_req = HighSchoolLockers.closedLockers(10,2);
        System.out.println("Closed Lockers "+count_req);

    }
}
