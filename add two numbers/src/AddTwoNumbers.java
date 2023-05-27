//import scanner class
import java.util.Scanner;

//class
public class AddTwoNumbers {
	
	//main method
	public static void main(String[] args) {
		
		//create object for scanner class
		Scanner sc = new Scanner(System.in);
		
		//print statement
		System.out.println("Enter the value of A: ");
		
		//variable
		int a = sc.nextInt();
		
		System.out.println("Enter the value of B: ");
		int b = sc.nextInt();
		
		System.out.printf("The Addition of %d and %d is : %d ", a,b, a+b);
		
		//close the scanner object
		sc.close();
	}

}
