
class MyHash {
    int[] arr;
    int cap;
    int size;

    MyHash(int c) {
        cap = c;
        size = 0;
        arr = new int[c];
        for (int i = 0; i < cap; i++)
            arr[i] = -1;
    }

    int hash(int key) {
        return key % cap;
    }

    boolean insert(int x) {
        if (size == cap)
            return false;

        int h = hash(x);
        int i = h;
        while (arr[i] != -1 && arr[i] != -2 && arr[i] != x) {
            i = (i + 1) % cap;
        }
        if (arr[i] == x)
            return false;
        else {
            arr[i] = x;
            size++;
            return true;
        }
    }

    boolean search(int x) {
        int h = hash(x);
        int i = h;
        while (arr[i] != -1) {
            if (arr[i] == x)
                return true;
            i = (i + 1) % cap;
            if (i == h)
                return false;
        }
        return false;
    }

    boolean erase(int x) {
        int h = hash(x);
        int i = h;
        while (arr[i] != -1) {
            if (arr[i] == x) {
                arr[i] = -2;
                return true;
            }
            i = (i + 1) % cap;
            if (i == h)
                return false;
        }
        return false;
    }
}

public class j10_open_addressing {
    public static void main(String[] args) {
        MyHash mh = new MyHash(7);
        mh.insert(49);
        mh.insert(56);
        mh.insert(72);
        if (mh.search(56) == true)
            System.out.println("Yes");
        else
            System.out.println("No");
        mh.erase(56);
        if (mh.search(56) == true)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
