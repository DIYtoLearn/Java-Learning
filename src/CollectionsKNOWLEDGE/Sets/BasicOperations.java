package CollectionsKNOWLEDGE.Sets;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


class ShowcaseSetBase
{

    private final Set<String> hst = new HashSet<>();

    // Default constructor to initialize the HashSet
    ShowcaseSetBase()
    {
        hst.add("Hello");
        hst.add("World");
        hst.add("Hello"); // Not added as duplicates are not allowed inside a SET

    }

    private void GetElements()
    {
        Scanner sc = new Scanner(System.in);
        String input  = sc.nextLine();
        sc.close();
        boolean val = hst.contains(input);
        System.out.println("Does it contains "+input+" "+val);

    }

    public void Print(){

        if(hst.isEmpty()) {
            System.out.println("Nothing in  there Bud ! as size is = "+hst.size());
        }

        else {
        // Enhanced for to iterate through the Objects in the Set
            System.out.print("The set contains : ");
        for(String Elements : hst){
            System.out.print(Elements+" ");
        }

        System.out.println();

        GetElements();
        }
    }

    public void ClearAll()
    {
        hst.clear();
    }
}

public class BasicOperations {
    public static void main(String[] args) {

        ShowcaseSetBase SSb = new ShowcaseSetBase();
        SSb.Print();
        SSb.ClearAll();
        SSb.Print();

    }
}