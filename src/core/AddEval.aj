package core;

public privileged aspect AddEval {
	public Integer core.Add.eval() {
		return left_value.eval() + right_value.eval();
	}
}
