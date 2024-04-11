package com.tttt;
import java.util.Scanner;

public class TwoThousandTwentyThree {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String month = sc.nextLine().toLowerCase();
           	   
        switch (month) {
            case "Jan": case "Feb": case "Mar":
                System.out.println("I COMPILLED ANTICIPATION");
                break;

            case "Apr": case "May": case "Jun":
                System.out.println("I EXECUTED HAPPINESS");
                break;

            case "Jul": case "Aug": case "Sep":
                System.out.println("I WITHESSED THE OVERFLOW OF PURE JOY");
                break;

            case "Oct": case "Nov": case "Dec":
                System.out.println("MY CODE ECHOED THE MELODY OF A GOOD ENDING TO A REMARKABLE YEAR");
                break;
        }
        sc.close();
	}

}
