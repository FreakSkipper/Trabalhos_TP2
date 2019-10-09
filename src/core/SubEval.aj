package core;

public privileged aspect SubEval {
	public Integer core.Sub.eval() {
		return left_value.eval() - right_value.eval();
	}
}
