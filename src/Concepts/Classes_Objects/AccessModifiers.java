package Concepts.Classes_Objects;

import All_tests.Test.Inh;

class checkPrivate
{
    int x = 10;
    private int y = 11;

    int getY()
    {
        return y;
    }

}

class success extends Inh
{
     protected success getIt() {
          fun();
          return null;
    }

    @Override
    protected void fun() {
        super.fun();
    }
}


public class AccessModifiers
{
    public static void main(String[] args) {

        checkPrivate chkp = new checkPrivate();

        System.out.println(chkp.getY() +" "+chkp.x);

        //System.out.println(chkp.y);

        success sc = new success();
        sc.getIt();
        sc.fun();

    }
}