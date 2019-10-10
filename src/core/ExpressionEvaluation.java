package core;

import java.util.Scanner;
import java.util.Vector;


public class ExpressionEvaluation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		sc.close();
		Vector<String> vetor = new Vector<String>();
				
		for (int i = 0; i < s.length(); i++) {			
			if (s.charAt(i) == ' ') {
				continue;
			}
			else if (s.charAt(i) == '(') {
				continue;
			}
			else if (s.charAt(i) == ')') {
				continue;
			}
			else if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				String num = "" + s.charAt(i); 
				for (int j = i+1; j < s.length(); j++) {					
					if (s.charAt(j) < '0' || s.charAt(j) > '9') {		// n eh num
						i = j - 1;
						break;
					}
					else {
						num = num + s.charAt(j);
					}
				}
				vetor.add(num);
			}
			else if (s.charAt(i) == '+' || s.charAt(i) == '-') {
				vetor.add("" + s.charAt(i));
			}
			else {
				System.out.println("Expression error!");
				break;
			}
		}
		
		Vector<Expression> exp = new Vector<Expression>();
		Vector<Character> vetor_op = new Vector<Character>();
		
		for (int i = 0; i < vetor.size(); i++) {
			if (vetor.get(i).charAt(0) >= '0' && vetor.get(i).charAt(0) <= '9') {
				Expression lit = new Literal(Integer.parseInt(vetor.get(i)));
				exp.add(lit);		// soh preciso do 1 char para saber se eh um numero
			}
			else if (vetor.get(i).charAt(0) == '+') {
				vetor_op.add('+');
			}
			else if (vetor.get(i).charAt(0) == '-') {
				vetor_op.add('-');
			}
		}
		
		while (!vetor_op.isEmpty()) {
			char operation = vetor_op.remove(0);
			
			if (exp.size() >= 2) {
				Expression lit_left = exp.remove(0);
				Expression lit_right = exp.remove(0);
				
				if (operation == '+') {
					Add add_operation = new Add(lit_left, lit_right);
					exp.add(0, add_operation);
				}
				
				else if (operation == '-') {
					Sub sub_operation = new Sub(lit_left, lit_right);
					exp.add(0, sub_operation);
				}
			}
			else {
				System.out.println("Incorrect quantity of operands/operators");
				break;		// parar while (!vetor_op.isEmpty())
			}
		}
		
		if (vetor_op.isEmpty() && exp.size() == 1) {
			System.out.println(exp.get(0).print());
			System.out.println(exp.get(0).eval());
		}
	}
}
