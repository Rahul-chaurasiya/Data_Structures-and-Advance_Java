import java.util.*;

class j06_stack_using_1queue {

    static class Stack {

        static Queue<Integer> q;

        Stack() {
            q = new LinkedList<Integer>();
        }

        static void push(int x) {
            q.add(x);
            for (int i = 0; i < q.size(); i++) {
                q.add(q.remove());
            }
        }

        static void pop() {
            q.remove();
        }

        static int top() {
            return q.peek();
        }

        static int size() {
            return q.size();
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(10);
        s.push(5);
        s.push(15);
        s.push(20);

        System.out.println("current size: " + s.size());
        System.out.println(s.top());
        s.pop();
        System.out.println(s.top());
        s.pop();
        System.out.println(s.top());

        System.out.println("current size: " + s.size());
    }
}
