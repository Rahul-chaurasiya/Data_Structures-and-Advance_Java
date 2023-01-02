
public class j08_natural_number_sum {

    static int sum(int n){
        if(n<=0)
            return n;
        return (n+sum(n-1));
    }
    public static void main(String [] args) 
    {
    	int n = 4;
    	System.out.println(sum(n));
    }
}
