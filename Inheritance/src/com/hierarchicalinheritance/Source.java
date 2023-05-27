package com.hierarchicalinheritance;

public class Source {

	public static void main(String[] args) {
		
		Monitor m = new Monitor();
		m.com();
		m.mon();
		
		Cpu c = new Cpu();
		c.com();
		c.pro();
		
		Keyboard k = new Keyboard();
		k.com();
		k.key();
		
		Mouse mo = new Mouse();
		mo.com();
		mo.Mos();

	}

}
