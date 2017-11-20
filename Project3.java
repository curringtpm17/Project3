
import java.util.*;


public class Project3 {

	 public static int gcdExtended(int b, int f, int g)
	 {
		//variables to find a
			int h=0;
			int i=0;
			
			//find a
			i = f-1;
			h = g-1;
			int a = h*i;
			
		 //a is phi n b is public key  e
		 int x = 0, y = 1, lastx = 1, lasty = 0, temp;
	     while (b != 0)
	     {
	         int q = a / b;
	         int r = a % b;
	 
	         a = b;
	         b = r;
	 
	         temp = x;
	         x = lastx - q * x;
	         lastx = temp;
	 
	         temp = y;
	         y = lasty - q * y;
	         lasty = temp;            
	     }
	     
	     if(lasty > 0)
	    	 return lasty;
	     else
	    	 return lastx;

	    
	}

	public static void main(String[] args) {

		int b = 0;
		int p  = 17;
		int	q = 11;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the value of the public key: ");
		b = sc.nextInt();
		
		int d = gcdExtended(b, p, p);
		System.out.println("Your private key is: " +d);

	}

}
