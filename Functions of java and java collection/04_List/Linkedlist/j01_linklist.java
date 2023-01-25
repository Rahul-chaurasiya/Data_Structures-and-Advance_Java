import java.util.*;
public class j01_linklist {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<Integer>();

        
        System.out.println("add(E e)	: This method Appends the specified element to the end of this list.	Theta(1)");
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        

        System.out.println("add(int index, E element) : This method Inserts the specified element at the specified position in this list.	Theta(index)");
        list.add(2, 15);
        System.out.println(list);


        System.out.println("contains(Object o) : This method returns true if this list contains the specified element.	O(n)");
        System.out.println(list.contains(23));


        System.out.println("remove(int index) : This method removes the element at the specified position in this list.	Theta(index)");
        list.remove(2);
        System.out.println(list);


        System.out.println("get(int index) : This method returns the element at the specified position in this list.	Theta(index)");
        System.out.println(list.get(2));


        System.out.println("set(int index, E element) : This method replaces element at specified position in this list with the specified element.	Theta(index)");
        list.set(1, 15);
        System.out.println(list);


        System.out.println("indexOf(Object o) : This method returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element.	O(n)");
        System.out.println(list.indexOf(15));


        System.out.println("lastIndexOf(Object o) : This method returns the index of the last occurrence of the specified element in this list, or -1 if this list does not contain the element.	O(n)");
        System.out.println(list.lastIndexOf(15));


        System.out.println("isEmpty() : This method is used to check if a list is empty or not.	O(1)");
        System.out.println(list.isEmpty());

    }
}
