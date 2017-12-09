package c_matrix;

import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int s = sc.nextInt();
		int n = sc.nextInt();
		int[][] a = new int[m+1][s+1];
		int[][] b = new int[s+1][n+1];
		int[][] c = new int[m+1][n+1];
		for(int i=0;i<m;i++)
			for(int j=0;j<s;j++)
				a[i][j] = sc.nextInt();
		for(int i = 0; i < s; i++)
			for(int j = 0; j < n; j++)
				b[i][j] = sc.nextInt();
		
		for(int i=0;i<m;i++)
			for(int j=0;j<s;j++)
				for(int k=0;k<n;k++)
					c[i][k]+=a[i][j]*b[j][k];
		
		for(int i=0;i<m;i++)
		{
			for(int j=0;j<n;j++)
				System.out.print(c[i][j]+" ");
			System.out.println();
		}
	}	

}
