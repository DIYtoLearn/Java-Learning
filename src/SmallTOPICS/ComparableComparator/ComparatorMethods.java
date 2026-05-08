package SmallTOPICS.ComparableComparator;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
import java.util.List;

class PowerLevel{
    String character;
    int power_rating;

    public PowerLevel(String character, int power_rating)
    {
        this.character = character;
        this.power_rating = power_rating;
    }

    public int getPowerRating()
    {
        return power_rating;
    }
    public String getCharacter()
    {
        return character;
    }

    @Override
    public String toString()
    {
        return character+" has power rating of "+power_rating;
    }
}

public class ComparatorMethods {
    static void main() {
        List<PowerLevel> APlvl = new ArrayList<>();
        APlvl.add(new PowerLevel("Gintoki",77));
        APlvl.add(new PowerLevel("Goku",98));

        // Comparator for comparing according to power level


        //Collections.sort(APlvl,Comparator.comparing(APlvl));




        System.out.println("MAX Power Rating is 100");
        for(PowerLevel printIt : APlvl)
        {
            System.out.println(printIt.toString());
        }
    }
}