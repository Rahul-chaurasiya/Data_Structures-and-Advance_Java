import java.util.*;
class j02_stack_reverse {

    static void myReverse(List<Integer> list) {
        Stack<Integer> s = new Stack<Integer>();

        for (Integer x : list) {
            s.push(x);
        }

        for (int i = 0; i < list.size(); i++) {
            list.set(i, s.pop());
        }

    }

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 20, 30);

        System.out.println("Before: " + list);
        myReverse(list);
        System.out.println("After:  " + list);

    }

}