package CollectionsKNOWLEDGE.Generics;

class WithoutGenric{
    Object a;
    Object b;


}

class WithGenric<T,S>{
    T a;
    S b;
}



public class Gen1 {
    static void main() {
        WithoutGenric wg = new WithoutGenric();
        wg.a = 12;
        wg.b = "Get Gud";

        String str = (String) wg.a; // Throws Runtime exception ClassCaseException for this type cast
        System.out.println(str);


        WithGenric<Integer,String> WG = new WithGenric<>();
        WG.a = 12;
        WG.b = "Get Gud 2";

        String str2 = (String) WG.b; //(String) WG.a; // Does not let the code Compile due to type mismatch
        System.out.println(str2);
    }
}
