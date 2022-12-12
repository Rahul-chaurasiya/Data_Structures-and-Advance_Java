
class demo {

    static void insert(int a[], int num, int pos, int size) {

        if ((pos - 1) >= size) {
            System.out.println("array is out of index");
        } else {
            for (int i = size - 1; i >= pos - 1; i--) {
                a[i + 1] = a[i];
            }
            a[pos - 1] = num;
            for (int i = 0; i < size; i++) {
                System.out.println(a[i]);
            }
        }
    }

    public static void main(String[] args) {
        int num = 31;
        int pos = 4;
        int a[] = new int[7];
        a[0] = 23;
        a[1] = 25;
        a[2] = 45;
        a[3] = 67;
        int size = 6;
        insert(a, num, 1, size);

    }
}
