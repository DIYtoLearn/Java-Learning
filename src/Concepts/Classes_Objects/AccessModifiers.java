package Concepts.Classes_Objects;

class checkPrivate
{
    int x = 10;
    private int y = 11;

    int getY()
    {
        return y;
    }

}

public class AccessModifiers {
    public static void main(String[] args) {

        checkPrivate chkp = new checkPrivate();

        System.out.println(chkp.getY());

        System.out.println(chkp.y);

    }
}