package core;

import java.util.Scanner;
import java.util.Vector;



public class ExpressionEvaluation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		Vector<String> vetor = new Vector<String>();
				
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				
			}
			else if (s.charAt(i) == '(') {
			}
			else if (s.charAt(i) == ')') {
			}
			else if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				String num = "" + s.charAt(i); 
				for (int j = i+1; j < s.length(); j++) {					
					if (s.charAt(j) < '0' || s.charAt(j) > '9') {		// n é num
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
		
		if (vetor.size() != 0) {
			// System.out.println((int) ' ');
			for (String str : vetor) {
				System.out.println(str);
			}
		}
	sc.close();
	}

}
