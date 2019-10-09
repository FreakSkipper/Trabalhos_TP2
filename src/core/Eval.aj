package core;

// Para acessar atributos ou métodos privados, aspect precisa ter "privileged"
public privileged aspect Eval {
	public abstract Integer core.Expression.eval();
	
	public Integer core.Literal.eval() {
		return value;
	}
}
