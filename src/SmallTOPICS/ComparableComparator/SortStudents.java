package SmallTOPICS.ComparableComparator;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class newStudent {
    private String name;
    private Integer rollNo;

    public newStudent(String name, Integer rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() { return name; }
    public Integer getRollNo() { return rollNo; }

    @Override
    public String toString() {
        return "(" + name + ", " + rollNo + ")";
    }
}

public class SortStudents {
    static void main() {

        List<newStudent> students = Arrays.asList(
                new newStudent("Zack", 105),
                new newStudent("Alice", 102),
                new newStudent("Alice", 101)
        );

        // 1. Using traditional compare() via a lambda
        Comparator<newStudent> rollNoComparator = (s1, s2) -> s1.getRollNo().compareTo(s2.getRollNo());
        students.sort(rollNoComparator);
        System.out.println("Sorted by Roll No (compare): " + students);

        // 2 & 3. Using comparing() and thenComparing()
        // This sorts by name first. If names are equal, it sorts by roll number.
        Comparator<newStudent> nameThenRoll = Comparator
                .comparing(newStudent::getName)
                .thenComparing(newStudent::getRollNo);

        students.sort(nameThenRoll);
        System.out.println("Sorted by Name, then Roll No: " + students);



    }
}