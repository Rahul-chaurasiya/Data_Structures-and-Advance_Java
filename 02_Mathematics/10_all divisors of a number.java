


class demo{

    static void printDivisors(int n){
        for(int i=1;i<=n;i++){
            if(n%i == 0){
                System.out.print(i+" ");
            }
        }
    }


	public static void main (String[] args) {
		
		int n = 25;

		printDivisors(n);

	}
}



=======================================================================
    
//efficient solution
    


class demo{

	static void printDivisors(int n)
	{
		for(int i=1; i*i <= n; i++)
		{
			if(n % i == 0)                                   // input:25 
                                                             // 1,25   5,5
			{
				System.out.print(i+" ");

				if(i != n / i)                                
					System.out.print((n / i)+" ");			// 5 ko 1 hi baar print krega ye 
			}
		}
	}

	public static void main (String[] args) {
		
		int n = 25;
		printDivisors(n);

	}
}



=======================================================================
    
// efficient solution in sorted order
    


class demo{

	static void printDivisors(int n)
	{
	    int i;
		for(i=1; i*i < n; i++)
			if(n % i == 0)	System.out.print(i+" ");                     // sort krne k liye pehle loop ko half tk run krege then half run ko back m check krke uska quotent print krege
		
		for( ; i >= 1; i--)
			if(n % i == 0)	System.out.print((n / i)+" ");
	}

	public static void main (String[] args) {
		
		int n = 25;
		printDivisors(n);

	}
}
    
