public class GFG{
    public static void main(String []args) throws IOException{
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-->0) {
        	String S = read.readLine();
        	Solution ob = new Solution();
       	
        	System.out.println(ob.revStr(S));
        }      
     } 
}
class Solution {
	
	static String revStr(String S) {
		StringBuilder sb=new StringBuilder(S);
		sb.reverse();
		return sb.toString();
	}
}
