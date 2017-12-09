package c_heapdijkstra;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    
    static class edge {
        public int a;  //边的起点
        public int b;  //边的终点
        public int value;  //边的权值
        
        edge(int a, int b, int value) {
            this.a = a;
            this.b = b;
            this.value = value;
        }
    }
    
    public void spfa(ArrayList<edge>[] listA, int n) {
        long[] result = new long[n];
        int[] num = new int[n];
        boolean[] used = new boolean[n];
        for(int i = 1;i < n;i++) {
            result[i] = Integer.MAX_VALUE;
            used[i] = false;
        }
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(0);
        num[0] = 1;
        used[0] = true;
        while(list.size() > 0) {
            int start = list.getFirst();
            for(int i = 0, length = listA[start].size();i < length;i++) {
                int b = listA[start].get(i).b;
                int value = listA[start].get(i).value;
                if(result[b - 1] > result[start] + value) {
                    result[b - 1] = result[start] + value;
                    if(!used[b - 1]) {
                        used[b - 1] = true;
                        list.add(b - 1);
                        num[b - 1]++;
                        if(num[b - 1] > n)
                            return;
                    }
                }
            }
            list.removeFirst();
            used[start] = false;    
        }
        for(int i = 1;i < n;i++)
            System.out.println(result[i]);
        return;
    }
    
    public static void main(String[] args) {
        Main test = new Main();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        if(n > 20000 || n < 1 || m > 200000 || m < 1)
            return;
        @SuppressWarnings("unchecked")
        ArrayList<edge>[] listA = new ArrayList[n];
        for(int i = 0;i < n;i++)
            listA[i] = new ArrayList<edge>();
        for(int i = 0;i < m;i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int value = in.nextInt();
            if(value > 10000 || value < -10000)
                return;
            listA[a - 1].add(new edge(a, b, value));
        }
        test.spfa(listA, n);
    }
}