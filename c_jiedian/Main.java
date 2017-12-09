package c_jiedian;

import java.util.Scanner;

public class Main {

	public static int[][] dp = new int[100001][2];	//每个节点取或不取的最大值
	public static int[][] t = new int[100001][100]; //t[i][3]=num 表示第i个结点的第三个孩子结点为第num个结点
	/**
	 * 
	 * @param a 表示输入的第a个结点
	 * @param b 表示输入的第b个结点
	 */

	public static void creatTree(int a,int b) {
		//当第a个结点为父节点时
		int i=0;
		while(t[a][i]!=0) i++;	//确保当前为空 
		t[a][i]=b;
		//当第b个结点为父节点时
		int j=0;
		while(t[b][j]!=0) j++;
		t[b][j]=a;
	}
	
	/**
	 * 
	 * @param start 进行DFS遍历的开始节点
	 * @param root 第start个节点的父节点位置，root=0表示根节点的父节点
	 */
	public static void dfs(int start,int root) {
		int child = t[start][0]; //第start结点的第1个孩子
		for(int i=0;child!=0;i++){
			child=t[start][i];
			if (child!=root) {	//保证父子不同
				dfs(child, start);//递归下一层
				dp[start][1]+=dp[child][0];//当第child个节点没有孩子节点时，开始回溯
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
		dfs(1, 0);//从创建的数的根节点（即第1个顶点，0表示根节点的父节点）开始进行DFS遍历

		int max=dp[1][1]>dp[1][0]?dp[1][1]:dp[1][0];//第一个点选或不选的max值
		System.out.print(max);
	}

}
