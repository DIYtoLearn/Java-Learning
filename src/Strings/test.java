package Strings;


public class test {

    public static void main(String[] args) {

        String str = "vnjb nsjpjbjlmbvrekhawnvrmpytfvdgqbjznxwruzlkkyi";
        int count = 0;
        int space = 0;
        int len = str.length();
        int x;

        for(int i=0; i<len; i++)
        {
            x = str.charAt(i);

            if(x == 32)
            {
                space++;
                count++;
            }

            if(count != 0 && i == (len-1))
                count++;
        }

        if(space == 0 && !str.isEmpty())
            count++;

        System.out.println(count);
    }
}

