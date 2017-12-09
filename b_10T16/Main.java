package b_10T16;

import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		String a = "";
		do {
			switch (n%16) {
			case 10:
				a="A"+a;
				break;
			case 11:
				a="B"+a;
				break;
			case 12:
				a="C"+a;
				break;
			case 13:
				a="D"+a;
				break;
			case 14:
				a="E"+a;
				break;
			case 15:
				a="F"+a;
				break;
			default:
				a=n%16+a;
				break;
			}	
			n=n/16;
		} while (n!=0);
		
		System.out.print(a);
	}
}
