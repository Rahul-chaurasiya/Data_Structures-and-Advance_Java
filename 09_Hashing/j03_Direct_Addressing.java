class hash {
    int[] table = new int[1000];

    void insert(int i) {
        table[i] = 1;
    }

    void del(int i) {
        table[i] = 0;
    }

    int search(int i) {
        return table[i];
    }
}

class j03_Direct_Addressing {

    public static void main(String[] args) {
        hash dat = new hash();
        dat.insert(10);
        dat.insert(20);
        dat.insert(119);
        System.out.println(dat.search(10));
        System.out.println(dat.search(20));
        dat.del(119);
        System.out.println(dat.search(119));

    }
}
