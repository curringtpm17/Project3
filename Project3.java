
import java.util.*;


public class Project3 {

	public static int privateKey(int b, int p, int q){
		
		//variables to find a
		int r=0;
		int s=0;
		
		//find a
		r = p-1;
		s = q-1;
		int a = r*s;
	
		//base case
		if(b == 0){
			return a;
		}
		
		//y is the same private key as d
		int y = privateKey(b%a, p, q);
		
		return y;
		
	}
	public static void main(String[] args) {

		int b = 0;
		int p  = 11;
		int	q = 5;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Please enter the value of the public key: ");
		b = s.nextInt();
		
		int d = privateKey(b, p, q);
		System.out.println(d);

	}

}
