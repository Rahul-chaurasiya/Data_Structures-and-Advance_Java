public class j04_bitwize_operator {
    public static void main(String[] args) {

        int n = 1;
        System.out.println(~n);

        // left shift operator
        int x = 3;
        System.out.println(x << 1);
        System.out.println(x << 2);

        int y = 4;
        int z = (x << y);
        System.out.println(z);

        // left shift operator by negetive number
        int m = -1;
        System.out.println(m << 1);
    }
}
