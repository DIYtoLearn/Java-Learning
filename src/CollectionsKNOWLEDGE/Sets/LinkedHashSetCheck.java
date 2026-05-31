package CollectionsKNOWLEDGE.Sets;
import java.util.*;

class Showcase{

    private static final Set<String> HSET = new HashSet<>();
    private static final Set<String> LNSET = new LinkedHashSet<>();

    private static void InputALotOfElements()
    {
        String[] arr = {"12","13","14","141","252","2511","25211","255114","1","3","2","5","225",null,"252","-14","-13","0","124","2","52","924525","2","93222","2526",null,"-2525"};
        List<String> LST = Arrays.asList(arr);

        HSET.addAll(LST);
        LNSET.addAll(LST);
    }

    public static void PrintAll()
    {
        InputALotOfElements();

        System.out.println("THe hash Set "+HSET); // Insertion Order Changes
        System.out.println("The Linked Hash Set "+LNSET); // Insertion Order is Preserved
    }
}

public class LinkedHashSetCheck {
    public static void main(String[] args)
    {
        Showcase.PrintAll();

    }
}