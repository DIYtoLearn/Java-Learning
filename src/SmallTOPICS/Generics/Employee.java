package SmallTOPICS.Generics;

public class Employee {

    private Integer LpaPerAnnum;
    private String name;

    Employee(Integer LpaPerAnnum, String name){
        this.LpaPerAnnum = LpaPerAnnum;
        this.name = name;
    }

    public String toString()
    {
        return "Name: "+name+" LPA: "+LpaPerAnnum;
    }
}