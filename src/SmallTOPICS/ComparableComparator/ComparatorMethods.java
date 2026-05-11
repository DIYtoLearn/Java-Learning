package SmallTOPICS.ComparableComparator;
import java.util.*;

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
    static void main() throws InterruptedException {
        List<PowerLevel> APlvl = new ArrayList<>();
        APlvl.add(new PowerLevel("Gintoki",77));
        APlvl.add(new PowerLevel("Goku",98));
        APlvl.add(new PowerLevel("Normal human",11));
        APlvl.add(new PowerLevel("Gin",77));
        APlvl.add(new PowerLevel("Thragg",84));

        // Comparator for comparing according to power level if power level is same sort by character length
        Collections.sort(APlvl, (O1, O2)->{
                if(O1.power_rating != O2.power_rating)
                    return O1.power_rating - O2.power_rating;

                else
                    return O1.character.length() - O2.character.length();
        });


        System.out.println(" MAX Power Rating is 100\n ---Sorted by Power Rating---");
        for(PowerLevel printIt : APlvl)
        {
            Thread. sleep(1000);
            System.out.println(printIt.toString());
        }
    }
}