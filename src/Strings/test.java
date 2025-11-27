package Strings;

// Count the number of words in a given string
public class test {

    static void countWords()
    {
        String str;
        //str = "Hello   world this is  Java   ";
        str = "vnjb nsjpjbjlmbvrekhawnvrmpytfvdgqbjznxwruzlkkyi";
        int count = 0;
        boolean inWord = false;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                if (!inWord) {
                    count++;
                    inWord = true;
                }
            } else {
                inWord = false;
            }
        }

        System.out.println(count);

    }

    public static void main(String[] args) {

        String str = "vnjb nsjpjbjlmbvrekhawnvrmpytfvdgqbjznxwruzlkkyi";
        int count = 0;
        int space = 0;
        int len = str.length();
        int x;

        for (int i = 0; i < len; i++) {
            x = str.charAt(i);

            if (x == 32) {
                space++;
                count++;
            }

            if (count != 0 && i == (len - 1))
                count++;
        }

        if (space == 0 && !str.isEmpty())
            count++;

        //System.out.println(count);

        countWords();

    }
}

