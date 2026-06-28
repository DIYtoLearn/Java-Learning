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



    }
}