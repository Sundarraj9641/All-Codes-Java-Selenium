package quadratic.equation;

import java.util.Scanner;

public class QuadraticEquation {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value for a : ");
		double a = sc.nextDouble();
		
		System.out.println("Enter the value for b : ");
		double b = sc.nextDouble();
		
		System.out.println("Enter the value for c : ");
		double c = sc.nextDouble();
		
		double Res = (b*b) - (4.0*a*c);
		
		
		if(Res>0.0) {
			double Re1 = (-b + Math.pow(Res, 0.5))/(2.0*a);
			double Re2 = (-b - Math.pow(Res, 0.5))/(2.0*a);
			
			System.out.println("The Roots are " + Re1+ " and " + Re2);
		} else if(Res==0.0) {
			
			double Re3 = -b/(2.0*a);
			
			System.out.println("The Root is" + Re3);
		} else {
			System.out.println("No Real Roots");
		}
		
		sc.close();
		

	}

}
