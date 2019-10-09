package core;

import core.Expression;

public class Literal implements Expression{
	private int value;
	
	public String print() {
		return Integer.toString(value);
	}
}
