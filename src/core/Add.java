package core;

public class Add implements Expression{
	private Expression left_value;
	private Expression right_value;
	
	public Add(Expression left_value, Expression right_value) {
		this.left_value = left_value;
		this.right_value = right_value;
	}
	
	public String print() {
		return " (" + left_value.print() + " + " + right_value.print() + ") ";
	}
}
