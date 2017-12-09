package c_jiedian;

import java.util.Scanner;

public class Main {

	public static int[][] dp = new int[100001][2];	//ÿ���ڵ�ȡ��ȡ�����ֵ
	public static int[][] t = new int[100001][100]; //t[i][3]=num ��ʾ��i�����ĵ��������ӽ��Ϊ��num�����
	/**
	 * 
	 * @param a ��ʾ����ĵ�a�����
	 * @param b ��ʾ����ĵ�b�����
	 */

	public static void creatTree(int a,int b) {
		//����a�����Ϊ���ڵ�ʱ
		int i=0;
		while(t[a][i]!=0) i++;	//ȷ����ǰΪ�� 
		t[a][i]=b;
		//����b�����Ϊ���ڵ�ʱ
		int j=0;
		while(t[b][j]!=0) j++;
		t[b][j]=a;
	}
	
	/**
	 * 
	 * @param start ����DFS�����Ŀ�ʼ�ڵ�
	 * @param root ��start���ڵ�ĸ��ڵ�λ�ã�root=0��ʾ���ڵ�ĸ��ڵ�
	 */
	public static void dfs(int start,int root) {
		int child = t[start][0]; //��start���ĵ�1������
		for(int i=0;child!=0;i++){
			child=t[start][i];
			if (child!=root) {	//��֤���Ӳ�ͬ
				dfs(child, start);//�ݹ���һ��
				dp[start][1]+=dp[child][0];//����child���ڵ�û�к��ӽڵ�ʱ����ʼ����
				dp[start][0]+=dp[child][1]>dp[child][0]?dp[child][1]:dp[child][0];
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
			dp[i+1][1]=sc.nextInt();
		for(int i=0;i<n-1;i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			creatTree(a, b);
		}
		dfs(1, 0);//�Ӵ��������ĸ��ڵ㣨����1�����㣬0��ʾ���ڵ�ĸ��ڵ㣩��ʼ����DFS����

		int max=dp[1][1]>dp[1][0]?dp[1][1]:dp[1][0];//��һ����ѡ��ѡ��maxֵ
		System.out.print(max);
	}

}
