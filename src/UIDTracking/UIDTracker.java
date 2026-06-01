package UIDTracking;

public class UIDTracker {
    public static void main(String[] args) {

        String s = "Solution";
        String currentUID_for_class_name_starting_with_Solution = s+"UID_0";
        System.out.println(currentUID_for_class_name_starting_with_Solution);

        int number = 1;
        number = number+1;
        System.out.println(currentUID_for_class_name_starting_with_Solution+number);

    }
}