package c_kh;

import java.util.Scanner;

public class Main {

	/**
	 * ��iλ������j���õ�������K������i-1������������K����֮��ȥ����j���ڵ�����������
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int l = sc.nextInt();
		
		int[][] dp = new int[110][110];
		
		for(int i=0;i<k;i++)
			dp[1][i]=1;
		for(int i=2;i<=l;i++)
			for(int j=0;j<k;j++)
				for(int t=0;t<k;t++)
					if(t+1!=j&&t-1!=j)
					{
						dp[i][j]+=dp[i-1][t];
						dp[i][j]%=1000000007;
					}
		int sum=0;
		for(int i=1;i<k;i++) ////��һλΪ0�Ĳ�Ҫ
		{
			sum+=dp[l][i];
			sum%=1000000007;
		}
		System.out.print(sum);
	}

}
