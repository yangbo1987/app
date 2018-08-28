package com.test.mode2;

public class LogFilter implements Filter {

	@Override
	public void execute(String request) {
		System.out.println("log =="+request);
	}

}
