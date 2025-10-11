package Array_Strings;

public class Count_words {

    String given = "Geekks";
    String given2 = "Nw string check";
    String given3 = " chk  ";

    // Count the number of words in the above string's ?
    String chk = given3;

    public static void main(String[] args) {
        Count_words cwrd = new Count_words();
        System.err.println(cwrd.chk);

        String[] wordcount = cwrd.chk.trim().split("\\s+");
        System.out.println("Word count: " + wordcount.length);
    }
}