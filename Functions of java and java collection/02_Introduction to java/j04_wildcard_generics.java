import java.io.*;
import java.util.*;

class Student{
    
}

class EnggStudent extends Student{
    
}

class j04_wildcard_generics{
	public static void main (String[] args) {
		
		// Example with simple inheritance			
		Student s1= new Student();
		EnggStudent s2 = new EnggStudent();
		s1=s2;
			

		// Collection with Wildcard(any type)
		ArrayList<?> al1 = new ArrayList<>();
		ArrayList<EnggStudent> al2 = new ArrayList<>();		
		al1=al2;


 		// Wildcard(upper bounding):
		ArrayList<? extends Student> al1 = new ArrayList<>();
		ArrayList<EnggStudent> al2 = new ArrayList<>();
		al1=al2;
		

		// Wildcard(lower bounding):
		ArrayList<? super Student> al1 = new ArrayList<>();
		ArrayList<Object> al2 = new ArrayList<>();
		al1=al2;
	}
}
