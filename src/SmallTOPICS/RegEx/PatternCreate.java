package SmallTOPICS.RegEx;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PatternCreate {
    static void main() {
        Pattern pat = Pattern.compile("[a-zA-Z0-9]");
        Matcher mat = pat.matcher("killLaKill_1;'ea");

        while(mat.find()){
            System.out.println(mat.find());
            System.out.println(mat.start()+" "+(mat.end()-1));
        }
    }
}