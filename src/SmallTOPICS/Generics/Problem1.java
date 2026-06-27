package SmallTOPICS.Generics;

class container<T>{

    private T variable;

    public void setVariable(T variable)
    {
        this.variable = variable;
    }

    public T getVariable(){
        return variable;
    }
}

class pair<K, V>{
    private K var1;
    private V var2;

    pair(K var1, V var2){
        this.var1 = var1;
        this.var2 = var2;
    }

    public String toString(){
        return var1+" "+var2;
    }
}

// Rewrite using Generics
class Storage<T>{

    T value;

    void set(T value){
        this.value=value;
    }

    public T get(){
        return value;
    }
}


public class Problem1 {
    public static void main(String[] args) {

        container<Integer> cont1 = new container<>();
        container<String> cont2 = new container<>();
        container<Double> cont3 = new container<>();

        cont1.setVariable(11);
        cont2.setVariable("Immortal 2");
        cont3.setVariable(12.34442);

        System.out.println(cont1.getVariable());
        System.out.println(cont2.getVariable());
        System.out.println(cont3.getVariable());

        pair<String, Employee> pr = new pair<>("ID 1 -->", new Employee(100000000, "Upayan 34"));
        System.out.println(pr);

        pair<String, Integer> pr2 = new pair<>("Hole", 1);
        System.out.println(pr2);


    }
}