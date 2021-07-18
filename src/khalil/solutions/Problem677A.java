package khalil.solutions;

import java.util.Scanner;

public class Problem677A {
public static void main(String[] args) {
		
	    Scanner in = new Scanner(System.in);  		
		
	    int n = in.nextInt();
	    int h = in.nextInt();
	    
	    int[] a = new int[n];

	    int minWidth = 0;
	    
	    for ( int i = 0 ; i < n ; i++ )
	    {
	    	a[i] = in.nextInt();
	    	minWidth += a[i] > h ? 2 : 1;
	    }
	    
	    in.close();
		System.out.println(minWidth);
	}
}
