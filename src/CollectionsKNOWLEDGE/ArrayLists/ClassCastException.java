package CollectionsKNOWLEDGE.ArrayLists;
import java.util.ArrayList;

class testadd{
    private Integer hello;
    testadd(Integer hello)
    {
        this.hello = hello;
    }

    protected Integer returnhello()
    {
        return hello;
    }
}

public class ClassCastException {
    static void main() {

        ArrayList alist = new ArrayList(); // Declaration of Arraylist without Generics <>
        alist.add(10);
        alist.add("kad");
        alist.add('a');
//        testadd tad = new testadd(11);
//        alist.add(tad.returnhello());
        alist.add(new testadd(10102020));

        int res = ((testadd) alist.getLast()).returnhello();
        System.out.println("Method return Hello "+res);

        for(Object element : alist)
        {
            System.out.println(element);
        } // The code executes fine till here !

        try {
            String num = (String) alist.get(0); // Errors out here as we are casting a integer value to string
            //class java.lang.Integer cannot be cast to class java.lang.String

        }
        catch (RuntimeException e){
            System.out.print("ClassCastException");
        }
    }
}