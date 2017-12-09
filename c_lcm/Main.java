package c_lcm;

import java.util.Scanner;

public class Main {
	
	public static int lcm(int a,int b)
	{
		int t,r;
		if(a<b) {
			t = a;
			a = b;
			b = t;
		}
		while(b!=0){
			r=a%b;
			a=b;
			b=r;
		}
		return a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.print(a*b/lcm(a,b));
	}

}
