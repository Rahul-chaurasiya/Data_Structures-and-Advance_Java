import java.util.*;
public class codechef {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            String par = sc.next() + sc.next();
            int child = sc.nextInt();
            String name = "";
            for (int i = 0; i < child; i++)
                name += sc.next();
            HashMap<Character, Integer> map = new HashMap<>();
            for (int i = 0; i < par.length(); i++) {
                char c = par.charAt(i);
                if (map.containsKey(c)) {
                    int count = map.get(c);
                    map.replace(c, (count + 1));
                } else {
                    map.put(c, 1);
                }
            }
            boolean b = true;
            for (int i = 0; i < name.length(); i++) {
                char c = name.charAt(i);
                if (map.containsKey(c)) {
                    int count = map.get(c);
                    if (count < 1) {
                        b = false;
                    } else {
                        map.replace(c, count - 1);
                    }
                } else
                    b = false;
            }
            if (b == true)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        sc.close();
    }

}
