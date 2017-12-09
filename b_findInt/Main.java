package b_findInt;

import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int x = sc.nextInt();
		int i;
		for(i=0;i<n;i++){
			if (a[i]==x) {
				System.out.print(i+1);
				break;
			}
		}
		if(i==n)
			System.out.print(-1);
	}

}
