package c_digui;

import java.util.Scanner;

public class Main {

	public static int digui(int k,int n)
	{
		//the most important
		if(k>n/2) k=n-k;
		//ตÝน้
		if(k==0||n==1) return 1;
		else return digui(k,n-1)+digui(k-1,n-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int n = sc.nextInt();
		System.out.print(digui(k,n));
		
	}

}
