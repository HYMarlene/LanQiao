package a_Sum;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner sc =new Scanner(System.in);
		long n = sc.nextInt();
		long sum=0;
		for(long i=1;i<=n;i++)
			sum+=i;
		System.out.println(sum);
		sc.close();
	}

}
