

class demo {
	static int fact(int n)
	{
		int res = 1;

		for(int i=2; i<=n; i++)
		{
			res = res * i;
		}
		return res;
	}

	public static void main (String[] args) {
		
		int number = 5;
		System.out.println(fact(number));

	}
}


==================================================================
    
    

class demo{
    static int factorial(int n){
        if(n==1) return n;
        else return (n*factorial(n-1));
    }
    
    public static void main(String []arg){
        
        int x=6;
        System.out.println(factorial(x));
    }
}
