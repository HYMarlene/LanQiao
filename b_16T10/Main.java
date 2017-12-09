package b_16T10;

import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = new String();
		a=sc.next();
		long sum = 0;
		for (int i = 0; i < a.length(); i++) {
			if(a.charAt(i)>='0'&&a.charAt(i)<='9')
				sum+=(Integer.valueOf(a.charAt(i))-48)*Math.pow(16, a.length()-1-i);
			switch (a.charAt(i)) {
			case 'A':
				sum+=10*Math.pow(16, a.length()-1-i);
				break;
			case 'B':
				sum+=11*Math.pow(16, a.length()-1-i);
				break;
			case 'C':
				sum+=12*Math.pow(16, a.length()-1-i);
				break;
			case 'D':
				sum+=13*Math.pow(16, a.length()-1-i);
				break;
			case 'E':
				sum+=14*Math.pow(16, a.length()-1-i);
				break;
			case 'F':
				sum+=15*Math.pow(16, a.length()-1-i);
				break;
			default:
				break;
			}
		}
		System.out.print(sum);
	}
}
