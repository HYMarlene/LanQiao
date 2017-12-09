package c_sort;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int[] a = new int[3];
		for(int i=0;i<3;i++)
			a[i]=in.nextInt();
		Arrays.sort(a);
		for(int i=2;i>=0;i--)
			System.out.print(a[i]+" ");
	}
}
