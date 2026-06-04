package Concepts.Equals_Hashing;
import java.util.HashSet;
import java.util.Set;

public class HashCode {
    public static void main(String[] args) {

        GenZEmployeeClass GnZ = new GenZEmployeeClass(1, "upayan");
        GenZEmployeeClass Gnz2 = new GenZEmployeeClass(2, "UPAYAN");
        System.out.println(Gnz2+"\n Equality Check "+GnZ.equals(Gnz2)+"\n\n");


        Set<GenZEmployeeClass> SGnZ = new HashSet<>();
        SGnZ.add(new GenZEmployeeClass()); // Adds a Null Name that is later changed to a Dummy value "CricStar" to avoid Null pointer Exception
        // when running Hascode "
        SGnZ.add(new GenZEmployeeClass());

        System.out.println("Override Done for the HashCode Method "+SGnZ.size());

        for(GenZEmployeeClass element : SGnZ)
        {
            System.out.println("HashCode of the Object Present and the current Size of the HashSet is "+element.hashCode()+"\n\n");
        }

        // Here we added objects that are similar according to our .equals() override hence only one of those objects were added to the HashSet
        SGnZ.clear();
        SGnZ.add(GnZ); SGnZ.add(Gnz2); SGnZ.add(new GenZEmployeeClass(3,"TooMuch"));

        System.out.println("Override Done for the HashCode Method and the current Size of the HashSet is "+SGnZ.size());

        for(GenZEmployeeClass element : SGnZ)
        {
            System.out.println("HashCode of the Object Present "+element.hashCode());
        }
    }
}