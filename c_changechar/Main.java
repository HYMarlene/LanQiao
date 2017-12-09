package c_changechar;

import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		char[] c = new char[21];
		c=a.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if (c[i]>='a'&&c[i]<='z') 
				c[i]=(char)(c[i]-32);
			else
				c[i]=(char)(c[i]+32);
		}
		for(int i=0;i<c.length;i++)
			System.out.print(c[i]);
	}

}
