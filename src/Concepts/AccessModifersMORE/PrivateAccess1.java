package Concepts.AccessModifersMORE;

class EncapsulationSTANDARD
{
    private String req = "No access out side class";

    // Can be used to access the value of the private instance variable outisde of this class
    public void getReq() {
       System.out.println(req);
    }
    // Can be used to manually set the value of the string value
    public void setReq(String req) {
        this.req = req;
    }

    // The private method that cannot be accessed outside this class
    private void methodcheck(float a, float b)throws ArithmeticException
    {
            double percentage = (a/b)*100;
            System.out.println("Percent: "+percentage+"%");
    }

    // Can be used to get the computational output for the private method methodcheck from outside this class
     public void getmethodcheck(int a, int b)
    {
        System.out.println("Getting the method output");
        methodcheck(a,b);

    }
}

public class PrivateAccess1 {
    public static void main(String[] args) {
        EncapsulationSTANDARD Estd = new EncapsulationSTANDARD();
        int x = 0;
        try {
            Estd.getmethodcheck(20,x);
        }
        catch (ArithmeticException e) // Why this line is not printing ?
        {
            System.out.println("cannot divide by "+x);
        }


        Estd.getReq();
        Estd.setReq("Hello New");
        Estd.getReq();
    }
}