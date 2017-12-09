package c_cow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

class edge{
	int a,b,v;
	
//	edge(int a,int b,int v){
//		this.a=a;
//		this.b=b;
//		this.value=v;
//	}
}
public class Main {

	static int pre[]; 
	static edge[] e;
	static int min = Integer.MAX_VALUE;
	
	
	//查找根节点
	public static int find(int x)
	{
		while(pre[x]!=x) x=pre[x];
		return x;
//		if(pre[x]==-1)
//			return x;
//		return pre[x]=find(pre[x]);
	}
	
	public static boolean union(int x,int y)
	{
		x=find(x);
		y=find(y);
		if(x==y)
			return false;
		else if(x<y)
			pre[y]=x;
		else
			pre[x]=y;
		return true;
	}
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		//ArrayList<edge> e = new ArrayList<edge>();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s1[] = bf.readLine().split(" ");
		int n = Integer.parseInt(s1[0]);
		int p = Integer.parseInt(s1[1]);
		int[] c = new int[n+1];
		pre = new int[n+1];
		e = new edge[p];
		int sum=0;
		int num=0;
		for(int i=1;i<=n;i++){
			pre[i]=i;
			c[i]=Integer.parseInt(bf.readLine());
			if(min>c[i])
				min=c[i];
		}
		String s2[] = new String[3];
		for( int i=0;i<p;i++){
			 s2 = bf.readLine().split(" ");
			 e[i]=new edge();
			 e[i].a = Integer.parseInt(s2[0]);
			 e[i].b = Integer.parseInt(s2[1]);
			 e[i].v = Integer.parseInt(s2[2]);
			 e[i].v=2* e[i].v+c[e[i].a]+c[e[i].b];
//	         e[i] = new edge(a,b,v);
		}
		Arrays.sort(e, new Comparator<edge>() {
			public int compare(edge a1,edge a2){
				return a1.v-a2.v;
			}
		});
		for(int i=0;i<p;i++)
		{
			if(union(e[i].a, e[i].b)){
				sum+=e[i].v;
				num++;
			}
			if(num==n-1)
				break;
		}
		System.out.print(min+sum);
		
	}

}
