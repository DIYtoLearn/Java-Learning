package SmallTOPICS.Generics;
import java.util.ArrayList;

class Printer<T>{

    public void Print(T values){
        System.out.println(values);
    }
}

class Holder<T>{

    private T first;
    private T second;

    Holder(T first, T second){
        this.first = first;
        this.second =second;
    }

    public void swap(){

        T temp;
        temp = first;
        first =second;
        second = temp;

        System.out.println(first +" "+ second);

    }
}

public class Problem2 {
    public static void main(String[] args) {

        ArrayList<Employee> AOfEmp= new ArrayList<>();
        AOfEmp.add(new Employee(1800000, "Upayan"));
        AOfEmp.add(new Employee(2500000, "Upayan 28"));
        AOfEmp.add(new Employee(3900000, "Upayan 30"));


        Printer<Employee> print1 = new Printer<>();
        for(Employee e : AOfEmp){
            print1.Print(e);
        }

        Holder<String> Hl1 = new Holder<>("1", "2");
        Hl1.swap();


    }
}