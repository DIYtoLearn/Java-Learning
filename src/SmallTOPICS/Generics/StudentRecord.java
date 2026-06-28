package SmallTOPICS.Generics;

public class StudentRecord<ID, MARKS> {

    private ID studentId;
    private MARKS marks;

    StudentRecord(ID studentId, MARKS marks)
    {
        this.studentId = studentId;
        this.marks = marks;
    }

    public String toString()
    {
        return "Student ID: "+studentId+" Marks:"+marks;
    }

}
