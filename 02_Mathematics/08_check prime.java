
class demo {

	static boolean isPrime(int n)
	{
		if(n==1)
			return false;

		for(int i=2; i*i<=n; i++)
		{
			if(n % i == 0)
				return false; 
		}
		return true;
	}

	public static void main (String[] args) {
		
		int n = 65;
		System.out.println(isPrime(n));

	}
}


==========================================================================
	
// efficient solution
    
class demo {

    static boolean isPrime(int x){
        if(x==1) return false;
        if(x==2 || x==3) return true;
        if(x%2==0 || x%3 == 0) return false;
        
        for(int i=5; i*i<=x ; i=i+6){                                   //for this line if we take input as 23 so we skip 1,2,3,4,6,8,9,10,12,14,15,16,18,20,21 
            if(x%i == 0 || x%(i+2) == 0) return false;                  // ab hme sirf i=5,5+2=7,
        }                                                               //             i=i+6=11,11=2=13
        return true;                                                    //             i=i+6=17,16        pr hi check krna rhega 
    }

	public static void main (String[] args) {
		
		int n = 1031;
		System.out.println(isPrime(n));

	}
}
