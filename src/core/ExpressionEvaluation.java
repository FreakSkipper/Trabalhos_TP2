package core;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Vector;

public class ExpressionEvaluation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		Queue<String> q = new LinkedList<>();
		
		// tem q atualizar a string dp de pegar o parenteses
		if (s.contains("(") && s.contains(")")) {
			int aux1 = s.indexOf("(");
			int aux2 = s.indexOf(")");
			
			String subs = s.substring(aux1 + 1, aux2);
			q.add(subs);
		}
		
		sc.close();
		
		for(String str : q) {
			System.out.println(str);
		}
	}

}
