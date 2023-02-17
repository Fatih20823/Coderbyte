import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class GFG {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());
		while(t-->0) {
			int n = Integer.parseInt(br.readLine().trim());
			int arr[] = new int[n];
			String inputLine[] = br.readLine().trim().split(" ");
			for(int i=0; i<n; i++) {
				arr[i] = Integer.parseInt(inputLine[i]);
			}
			Solution ob = new Solution();
			ob.sort012(arr, n);
			StringBuffer str = new StringBuffer();
			for(int i=0; i<n; i++) {
				str.append(arr[i]+" ");
			}
			System.out.println();
		}

       
	}	
}

class Solution {

    public static void sort012(int a[], int n) {
    	Arrays.sort(a);
	}
    
}
