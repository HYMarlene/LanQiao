package b_stringcmp;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
			if(s1.length()==s2.length())
			if(s1.toLowerCase().equals(s2.toLowerCase()))
				if(s1.equals(s2))
					System.out.println(2);
				else
					System.out.println(3);
			else
				System.out.println(4);
		else
			System.out.println(1);
		sc.close();
	}
}
