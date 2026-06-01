package Concepts.Equals_Hashing;

public class Equals1 {
    public static void main(String[] args) {

        GeniusClass GC1 = new GeniusClass();
        GC1.setGeniusValues("Upayan", "Engineering");

        GeniusClass GC3 = new GeniusClass();
        GC3.setGeniusValues("Upayan", "Engineering");

        GeniusClass GC2 = new GeniusClass();
        GC2.setGeniusValues("Dhriti", "All");

        // Cases where .equals returns TRUE instead of false since we are overridden it in the GeniusClass
        // Otherwise it would have returned false since Objects GC1 and GC3 point to different location in the heap memory
        System.out.println(GC1.equals(GC3)); // GC3 is cast to the variable other

        System.out.println(GC3); // Without the overridden toString method in the class Genius the output would have been in the format
        // package.classNameHASHCODE



    }
}