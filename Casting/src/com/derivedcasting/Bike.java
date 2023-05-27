package com.derivedcasting;

public class Bike extends Vehicle{

		public void speed() {
			System.out.println("Need to test the speed");
		}
		
		public static void main(String[] args) {
			
			//upcasting
			Vehicle v = new Bike();
			v.message();
			
			//downcasting
			Bike b =(Bike)v;
			b.message();
			b.speed();
			
		}
}
