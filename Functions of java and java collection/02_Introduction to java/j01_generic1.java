// Example Code(without generics)

class Pair {
    Object x;
    Object y;
}

class j01_generic1 {
    public static void main(String[] args) {
        Pair p = new Pair();

        p.x = 12;
        p.y = "GFG";

        String str = (String) p.x;
    }
}

// this code shows Exception in thread "main" java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.String (java.lang.Integer and java.lang.String are in module java.base of loader 'bootstrap')


======================================================================


// Example Code(with generics)
  
import java.io.*;

class Pair<T,S>
{
    T x;
    S y;
}


class j01_generic1 {
	public static void main (String[] args) {
		
		Pair<Integer,String> p = new Pair<Integer,String>();
		
		p.x=12;
		p.y="GFG";
		
		String str= (String)p.x;
	}
}

// this code shows java.lang.Error: Unresolved compilation problem: Cannot cast from Integer to String
