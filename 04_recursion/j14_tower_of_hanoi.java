

public class j14_tower_of_hanoi {

    static void ToH(int n, char a, char b, char c) {
        if (n == 1) {
            System.out.println("move 1 from " + a + " to " + c);
            return;
        }
        ToH(n - 1, a, c, b);
        System.out.println("move n from " + a + " to " + c);
        ToH(n - 1, b, a, c);
    }

    public static void main(String[] args) {
        int n = 3;
        ToH(n, 'A', 'B', 'C');
    }
}
