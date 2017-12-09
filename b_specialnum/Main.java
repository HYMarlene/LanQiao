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
			a=i/100;//°Ù
			b=i%100/10;//Ê®
			c=i%10;//¸ö
			if (a*a*a+b*b*b+c*c*c==i) {
				System.out.println(i);
			}
		}
	}

}
