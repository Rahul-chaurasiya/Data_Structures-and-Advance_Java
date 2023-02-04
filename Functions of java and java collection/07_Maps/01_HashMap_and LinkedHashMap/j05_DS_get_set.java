import java.util.*;

class UserList {

    HashMap<Integer, Integer> m;

    UserList() {
        m = new HashMap<Integer, Integer>();
    }

    int get(int id) {
        return m.get(id);
    }

    void set(int id, int balance) {
        m.put(id, balance);
    }
}

class j05_DS_get_set {

    public static void main(String args[]) {
        UserList users = new UserList();

        users.set(1, 100);
        users.set(2, 2000);

        System.out.println(users.get(1));

        users.set(1, 5000);

        System.out.println(users.get(1));

    }
}
