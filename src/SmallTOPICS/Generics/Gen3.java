package SmallTOPICS.Generics;

import java.util.ArrayList;

class Animal {
}

class Dog extends Animal {
}

public class Gen3 {

    public static void main(String[] args) {

        ArrayList<Animal> animals = new ArrayList<>();
        ArrayList<Dog> dogs = new ArrayList<>();

        // ❌ This line will cause a COMPILE-TIME ERROR (Generic Invariance)
        // animals = dogs;

        // ✔️ Valid way using wildcards (Covariance)
        ArrayList<? extends Animal> covariantList = dogs;

        // ✔️ Valid way using contravariance
        ArrayList<? super Dog> contravariantList = animals;

        // Demonstration

        covariantList = new ArrayList<Dog>();  // OK
        // covariantList.add(new Dog()); ❌ Not allowed (read-only behavior)

        contravariantList.add(new Dog()); // ✔️ Allowed

        System.out.println("Generic invariance demonstrated successfully.");
    }
}