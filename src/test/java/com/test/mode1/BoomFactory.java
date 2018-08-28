package com.test.mode1;

public class BoomFactory extends AbstractFactory {

	@Override
	public Moveable create() {
		return new Boom();
	}

}
