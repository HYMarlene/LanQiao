package b_LeapYear;

import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int y = sc.nextInt();
		if((y%4==0 && y%100!=0)||(y%400==0))
			System.out.print("yes");
		else
			System.out.print("no");
	}

}
