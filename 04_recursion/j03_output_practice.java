
public class j03_output_practice {
    static void fun(int n) {
        if (n == 0)
            return;

        System.out.println(n);
        fun(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        fun(3);
    }
}

output: 
3
2
1
1
2
3
 
===========================================================
  
public class j03_output_practice {
    static void fun(int n) {
        if (n == 0)
            return;

        fun(n - 1);
        System.out.println(n);
        fun(n - 1);
    }

    public static void main(String[] args) {
        fun(3);
    }
}

output :
1
2
1
3
1
2
1
  
