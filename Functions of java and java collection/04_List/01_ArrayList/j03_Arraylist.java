
import java.util.*;
class j03_Arraylist {
    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        System.out.println(al);



        ArrayList<Integer> a2 = new ArrayList<>(100);
        for (int i = 1; i <= 100; i++)
            a2.add(i);
        System.out.println(a2);



        ArrayList<Integer> a3 = new ArrayList<>();
        al.ensureCapacity(100);
        for (int i = 1; i <= 100; i++)
            a3.add(i);
        System.out.println(a3);

    }

}