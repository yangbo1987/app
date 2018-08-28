package com.test.mode2;

public class AuthFilter implements Filter {

	@Override
	public void execute(String request) {
		System.out.println("auth =="+request);
	}

}
