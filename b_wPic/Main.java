package b_wPic;

import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();//ÐÐ
		int m=sc.nextInt();//ÁÐ
		
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++)
			{
				char c = (char)(Math.abs(i-j)+'A');
				System.out.print(c);
			}
			System.out.println();
		}
			
	}

}
