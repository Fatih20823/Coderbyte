import java.util.Scanner;

class GFG {

	public static void main(String[] args) {
		
		Geeks g = new Geeks();
		g.getInput();
		
	}
	
	
}

class Geeks {
	static void getInput() {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0) {
			int a = sc.nextInt();
			String s = sc.next();
			s += sc.nextLine();
			
			System.out.println(a);
			System.out.println(s);
		}
	}
}
