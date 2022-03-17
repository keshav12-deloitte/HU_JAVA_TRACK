package Collections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.*;

public class Arraylist {
    public static void main(String[] args) {
        int i;
        ArrayList<String> l1 = new ArrayList <String> ();
        l1.add("Hashedin");
        l1.add("by");
        l1.add("deloitte");
        l1.add("2022");
        for(i=0;i<l1.size();i++)
        {
            System.out.print(l1.get(i));
            System.out.print(" ");
        }
        System.out.println(" ");
        Collections.reverse(l1);
        for(i=0;i<l1.size();i++)
        {
            System.out.print(l1.get(i));
            System.out.print(" ");
        }


    }



}
