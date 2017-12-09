package a_Fibonacci;

import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int[] f=new int[1000001];
		f[1]=f[2]=1;
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=3;i<=n;i++){
			f[i]=(f[i-1]+f[i-2])%10007;
	}
		System.out.println(f[n]);
		sc.close();
	}
}