package khalil.solutions;
import java.util.Scanner;

public class Presents136A {
	
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);  		
		
	    int n = in.nextInt();
	    
	    int[] p = new int[n+1];
	   
	    int input ;
	    
	    for ( int i = 0 ; i < n ; i++ )
	    {
	    	input = in.nextInt();
	    	p[input] = i+1;
	    }
	    for ( int i = 1 ; i < n+1 ; i++ )
	    {
	    	System.out.print(p[i]+" ");
	    }
	    in.close();
	}
}	
