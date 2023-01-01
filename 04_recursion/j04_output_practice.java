
public class j04_output_practice {
    static int fun(int n) {
        if (n == 1)
            return 0;
        else
            return 1 + fun(n / 2);
    }

    public static void main(String[] args) {
        System.out.println(fun(16));
    }
}

output :
4
  
=================================================
  
public class j04_output_practice {
    static void fun(int n) {
        if (n == 0)
            return;

        fun(n / 2);
        System.out.println(n % 2);
    }

    public static void main(String[] args) {
        fun(7);
    }
}

output :
1
1
1
