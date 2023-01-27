import java.util.*;

public class j05_arraylist_methods {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();

        al.add("geeks");
        al.add("ide");
        al.add("courses");
        
        //sorting---------------------------
        Collections.sort(al);                 /**We can sort ArrayList uaing "Colections.sort" key-word , also we have to imprt "Collections" package*/
        System.out.println(al);
        
        System.out.println("==============================================================");

        System.out.println(al);
        al.add(1, "practice");
        System.out.println(al);

        System.out.println("==============================================================");

        System.out.println(al.contains("ide"));
        al.remove(2);
        System.out.println(al.contains("ide"));
        al.remove("courses");
        System.out.println(al.contains("course"));

        System.out.println("==============================================================");

        ArrayList<Integer> a2 = new ArrayList<Integer>();

        a2.add(10);
        a2.add(20);
        a2.add(10);
        a2.add(30);

        System.out.println(a2.get(1));

        a2.set(1, 40);
        System.out.println(a2);

        System.out.println(a2.get(1));
        System.out.println(a2.indexOf(10));
        System.out.println(a2.lastIndexOf(10));
        System.out.println(a2.indexOf(50));

        System.out.println("==============================================================");

        System.out.println(a2.isEmpty());
        a2.clear();
        System.out.println(a2.isEmpty());

    }
}
