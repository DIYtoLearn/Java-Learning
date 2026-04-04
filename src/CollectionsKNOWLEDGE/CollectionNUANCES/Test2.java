package CollectionsKNOWLEDGE.CollectionNUANCES;

import java.io.*;
import java.util.*;

class Student {
}
class EnggStudent extends Student {
}

class Test {
    static void printList(List<? extends Student> list)
    {
        for (Student s : list) {
            System.out.println(s.getClass().getName());
        }
    }

    public static void main(String[] args)
    {
        List<EnggStudent> list = new ArrayList<>();
        list.add(new EnggStudent());
        printList(list);
    }
}
