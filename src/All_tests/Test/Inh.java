package All_tests.Test;

public class Inh {

     protected void fun()
    {
        System.out.println("This print statement is in another package");
    }

    protected void using()
    {
        fun();
    }
}

class another
{
    public static void main(String[] args) {
        Inh it2 = new Inh();
        it2.using();

    }
}
