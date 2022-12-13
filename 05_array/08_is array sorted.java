


class demo
{ 
    static boolean isSorted(int arr[], int n)
    {
    	for(int i = 0; i < n; i++)
    	{
    		for(int j = i + 1; j < n; j++)
    		{
    			if(arr[j] < arr[i])
    				return false;
    		}
    	}

    	return true;
    } 

    public static void main(String args[]) 
    { 
       int arr[] = {7, 2, 30, 10}, n = 4;

       System.out.println(isSorted(arr, n));
    } 
}


===================================================================
  
  
// effcient solution


class demo 
{ 
    static boolean isSorted(int arr[], int n)
    {
    	for(int i = 1; i < n; i++)
    	{
    	    if(arr[i] < arr[i - 1])
    	        return false;
    	}

    	return true;
    } 

    public static void main(String args[]) 
    { 
       int arr[] = {5, 12, 30, 2, 35}, n = 5;

       System.out.println(isSorted(arr, n));
    } 
}
