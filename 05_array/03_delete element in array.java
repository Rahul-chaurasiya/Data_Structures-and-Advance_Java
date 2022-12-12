

class demo {

    static void delete(int a[], int num, int pos, int size) {

        if (pos == size) {
            for(int i=0;i<pos-1;i++){
                System.out.println(a[i]);
            }
        }
        
        else{
            for(int i=pos-1;i<size-1;i++)
                a[i]=a[i+1];
            
            for(int i=0;i<a.length;i++)
                System.out.println(a[i]);
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
        a[4] = 54;
        a[5] = 78;
        int size = 6;
        delete(a, num, 2, size);

    }
}
