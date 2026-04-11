package SmallTOPICS.LambdaExpression;

@FunctionalInterface
interface implementation{
    void print();
}

class Another implements implementation{
    public void print(){
        System.out.println("Hello 2");
    }
}

public class SingleLineNoReturn {
    static void main() {
        implementation Lambda = ()->System.out.println("Hello");
        Lambda.print();

        Another obj1 = new Another();
        obj1.print();

        //This is an anonymous Class where java lets us create a class and object for it at one shot !
        implementation obj2 = new implementation() {
            @Override
            public void print() {
                System.out.println("Hello 3");
            }
        };
        obj2.print();
    }
}