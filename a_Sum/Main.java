package a_Sum;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc =new Scanner(System.in);
		long n = sc.nextInt();
		long sum=0;
		for(long i=1;i<=n;i++)
			sum+=i;
		System.out.println(sum);
		sc.close();
	}

}
