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
			a=i/1000;//ǧλ��
			b=i%1000/100;//��λ��
			c=i%100/10;//ʮλ��
			d=i%10;//��λ��
			if((a==d)&&(b==c))
				System.out.println(i);
		}*/   //̫������
		
		for(int i=1;i<10;i++)
			for(int j=0;j<10;j++)
				System.out.println(i*1001+j*110);	//System.out.println(i+""+j+""+j+""+i);
	}

}
