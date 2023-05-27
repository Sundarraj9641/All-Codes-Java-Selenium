package remove.vowels;

import java.util.Scanner;
public class RemoveVowels {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string");
		String s1 = sc.nextLine();
		String s2="";
		
		s2 = s1.replaceAll("[aeiou]", "");
		System.out.println(s2);
		sc.close();
	}

}
