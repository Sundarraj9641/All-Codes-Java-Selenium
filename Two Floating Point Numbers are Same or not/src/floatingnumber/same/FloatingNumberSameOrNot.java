package floatingnumber.same;

import java.util.Scanner;
public class FloatingNumberSameOrNot {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the 1st floating number");
		double a = sc.nextDouble();
		
		System.out.println("Enter the 2nd floating number");
		double b = sc.nextDouble();
		
		a = Math.round(a*1000);
		a=a/1000;
		
		b = Math.round(b*1000);
		b=b/1000;
		
		if(a == b) {
			System.out.println("Same");
		} else {
			System.out.println("Different");
		}
		sc.close();
	}

}
