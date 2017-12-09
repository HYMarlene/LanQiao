package b_Palindrome2;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*int a,b,c,d;
		for(int i=1000;i<10000;i++)
		{
			a=i/1000;//千位数
			b=i%1000/100;//百位数
			c=i%100/10;//十位数
			d=i%10;//个位数
			if((a==d)&&(b==c))
				System.out.println(i);
		}*/   //太复杂了
		
		for(int i=1;i<10;i++)
			for(int j=0;j<10;j++)
				System.out.println(i*1001+j*110);	//System.out.println(i+""+j+""+j+""+i);
	}

}
