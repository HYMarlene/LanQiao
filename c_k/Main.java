package c_k;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer> b = new ArrayList<Integer>(n);
		int[] a = new int[n];
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		int m = sc.nextInt();
		int[] l = new int[m];
		int[] r = new int[m];
		int[] k = new int[m];
		for(int i=0;i<m;i++){
			l[i] = sc.nextInt();
		    r[i] = sc.nextInt();
			k[i] = sc.nextInt();
			
			for(int j=l[i]-1;j<r[i];j++)
				b.add(a[j]);
			Collections.sort(b);
			System.out.println(b.get(r[i]-l[i]-k[i]+1));
			b.clear();
		}			
	}
}
