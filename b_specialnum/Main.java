package b_specialnum;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		for(int i=100;i<1000;i++)
		{
			a=i/100;//��
			b=i%100/10;//ʮ
			c=i%10;//��
			if (a*a*a+b*b*b+c*c*c==i) {
				System.out.println(i);
			}
		}
	}

}
