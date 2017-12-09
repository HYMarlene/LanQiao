package b_Characters;

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
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=0;i<n;i++)
			list.add(sc.nextInt());
		Collections.sort(list);
		System.out.println(list.get(n-1));
		System.out.println(list.get(0));
		int sum = 0;
		for(int i:list)
			sum+=i;
		System.out.println(sum);
	}

}
