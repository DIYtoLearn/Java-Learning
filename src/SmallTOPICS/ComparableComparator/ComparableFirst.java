package SmallTOPICS.ComparableComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>
{
    int age;
    String name;

    Student(int age, String name)
    {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "Student [age= "+age +", name= " +name+"]";

    }
    // Sort the student's by increasing order of Age
    @Override
    public int compareTo(Student that) {
        if(this.age > that.age)
            return 1;
        else if(this.age == that.age)
            return 0;
        else
            return -1;
    }
}

public class ComparableFirst {
    static void main() {

        List<Student> studs = new ArrayList<>();
        studs.add(new Student(18, "Shashank"));
        studs.add(new Student(28, "Upayan"));
        studs.add(new Student(8, "Kumar"));
        studs.add(new Student(-8, "Priyam"));
        Collections.sort(studs);
        for(Student element : studs)
        {
            System.out.println(element.toString());
        }
    }
}