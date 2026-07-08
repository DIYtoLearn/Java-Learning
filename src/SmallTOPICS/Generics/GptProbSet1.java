package SmallTOPICS.Generics;

class Box<T>{

    private T variable;

    Box(){
        this.variable = null;
    }

    Box(T variable){
        this.variable = variable;
    }

    public boolean Empty(){
        return variable != null;

    }

    public void setVariable(T variable){
        this.variable = variable;
    }

    public T getVariable()
    {
        return variable;
    }

    // The method is independent of T which is the type parameter of the class that is used by the object of the class Box
    public <U> void print(U value)
    {
        System.out.println(value);
    }
}

class OldBox{

    Object item;

}

public class GptProbSet1 {
    public static void main(String[] args) {

        Box<Integer> Boxing = new Box<>(10);
        System.out.println(Boxing.getVariable());

        Box<Integer> Boxing2 = new Box<>(20);
        System.out.println(Boxing2.getVariable());

        Box<Integer> Boxing3 = new Box<>(30);
        System.out.println(Boxing3.getVariable());

        Box<String> Boxing4 = new Box<>();
        System.out.println(Boxing.Empty());
        //Boxing4.setVariable(100); Cannot Set String to int

        Box<Character> Boxing9 = new Box<>();
        Boxing9.print(100);
        Boxing9.print("100000");
        Boxing9.print(false);
        Boxing9.print(99.9999);


    }
}