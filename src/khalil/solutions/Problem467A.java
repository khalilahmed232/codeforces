package khalil.solutions;

import java.util.Scanner;

public class Problem467A {
public static void main(String[] args) {
		
	    Scanner in = new Scanner(System.in);  		
		
	    int n = in.nextInt();
	    
	    int[] p = new int[n];
	    int[] q = new int[n];

	    int rooms = 0;
	    
	    for ( int i = 0 ; i < n ; i++ )
	    {
	    	p[i] = in.nextInt();
	    	q[i] = in.nextInt();
	    	
	    	rooms +=  ( q[i] - p[i] ) >= 2 ? 1 : 0;
	    }
	    
	    in.close();
		System.out.println(rooms);
	}
}

