package c_Frequency;

import java.util.Scanner;

public class Main {

	/**
	 * ps：两组测试数据<=0
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int t=1,c=1;
		if(n>0)
		{
			int[] a = new int[n];
			for(int i=0;i<n;i++)
				a[i]=sc.nextInt();
			int b=a[0];
			for(int i=1;i<n;i++)
			{
				t=1;
				if(a[i]==a[i-1])
				{
					t=t+1;
					if(t>c)
					{
						c=t;
						b=a[i];
					}
				}
			}
					
			System.out.print(b);
		}
	}
}
