package b_Palindrome;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer> rs = new ArrayList<Integer>();
		
		for(int i=1;i<10;i++)
			for(int j=0;j<10;j++)
				for(int k=0;k<10;k++){
					if (2*i+2*j+k==n)
						rs.add(i*10001+j*1010+k*100);
					if (2*i+2*j+2*k==n)
						rs.add(i*100001+j*10010+k*1100);
				}
		Collections.sort(rs);
		for(int i=0;i<rs.size();i++)
			System.out.println(rs.get(i));
	}
}
