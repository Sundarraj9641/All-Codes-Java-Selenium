package positive.negative;

import java.util.Scanner;
public class PositiveOrNegative {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number: ");
		int a = sc.nextInt();
		
		if(a>0) {
			System.out.printf("%d is the Positive Number", a);
		} else {
			System.out.printf("%    d is the Negative Number", a);
		}
		sc.close();
		
	}

}
