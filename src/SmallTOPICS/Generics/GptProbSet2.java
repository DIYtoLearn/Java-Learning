package SmallTOPICS.Generics;

class Triple<A, B, C>{
    private A var1;
    private B var2;
    private C var3;

    Triple(A val1, B val2, C val3)
    {
        this.var1 = val1;
        this.var2 = val2;
        this.var3 = val3;
    }

    public String toString()
    {
        return var1+" "+var2+" "+var3;
    }
}

class Immutable<T>{
    private final T value;

    Immutable(T value){
        this.value = value;
    }

    public T getValue()
    {
        return value;
    }
}

public class GptProbSet2 {
    public static void main(String[] args) {

        Triple<String, Integer, Double> Tpl = new Triple<>("One", 2, 3.00);
        System.out.println(Tpl);

        Immutable<Character> Ich = new Immutable<>('M');
        System.out.println(Ich.getValue());


    }
}