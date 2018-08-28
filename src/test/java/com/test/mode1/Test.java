package com.test.mode1;

public class Test {
	public static void main(String[] args) {
		AbstractFactory factory=new BoomFactory();
		Moveable moveable=factory.create();
		moveable.fly();
	}
}
