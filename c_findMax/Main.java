package c_findMax;

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
		int maxIndex=0;
		for(int i=0;i<n;i++)
			if(a[maxIndex]<a[i])
				maxIndex=i;
		System.out.print(a[maxIndex]+" "+maxIndex);
	}

}
