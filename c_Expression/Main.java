package c_Expression;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	//符号栈和运算数栈
	public static Stack<Integer> res = new Stack<Integer>();
	public static Stack<Character> op = new Stack<Character>();

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num=0;
		op.push('(');
		char[] c = (sc.nextLine()+')').toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(c[i]>='0'&&c[i]<='9'){
				num=c[i]-'0';
				
				//如果用j控制循环，则第二个数字会参与外层循环
				for(i=i+1;i<c.length;i++)
				{
					if(c[i]>='0'&&c[i]<='9')
						num=num*10+(c[i]-'0');
					else
					{
						i--;
						break;
					}	
				}
				res.push(num);
			}
			
			else if(c[i]=='(')
				op.push(c[i]);

			else if(c[i]=='+'||c[i]=='-'||c[i]=='*'||c[i]=='/') {
				while(priority(op.peek(),c[i]))
					compute();
				op.push(c[i]);
			}
			
			else if(c[i]==')')
			{
				while(op.peek()!='(')
					compute();
				op.pop();
			}
		}
		System.out.println(res.peek());
	}
	
	public static boolean priority(char a,char b) {
		if(a=='*'||a=='/')
			return true;
		if (b == '*' || b == '/' || a == '(') {  
            return false;  
        }  
        return true;
		
	}
	public static void compute() {  
        char fh = op.pop();  
        int num2 = res.pop(); 
        int num1 = res.pop();  
        switch (fh) {  
        case '+':  
            res.push(num1 + num2);  
            break;  
        case '-':  
            res.push(num1 - num2);  
            break;  
        case '*':  
            res.push(num1 * num2);  
            break;  
        case '/':  
            res.push(num1 / num2);  
            break;  
        default:  
            break;  
        }  
    }  
}
