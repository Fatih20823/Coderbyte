import java.util.Scanner;

class Geeks {
	
	static void printInFormat(float a, float b) {
		float result = a/b;
		
		System.out.print(result+" ");
		System.out.format("%1.3f",result);
	}
}

public class GFG {


	public static void main (String[] args) {      
	   Scanner sc = new Scanner(System.in);
	    int testcases = sc.nextInt();
	    
	    while (testcases-- > 0) {
	    	
	    	float a = sc.nextFloat();
	    	float b = sc.nextFloat();
	    	
	    	Geeks g = new Geeks();
	    	
	    	g.printInFormat(a,b);
	    	System.out.println();
	    }
}


}
