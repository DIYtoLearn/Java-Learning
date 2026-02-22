package CollectionsKNOWLEDGE.INTERFACES;

import java.util.HashMap;
import java.util.Map;

public class MapsINTERFACE {
    static void main() {

        HashMap<String,Integer> hsm = new HashMap<>();

        hsm.put("Hello",21);
        hsm.put("World",77);

        System.out.println(hsm.get("Hello"));

        for(Map.Entry<String,Integer> e : hsm.entrySet())
        {
            System.out.println(e.getKey() +" "+e.getValue());
        }
    }
}