package a_Circle;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		double area = r*r*Math.PI;
		DecimalFormat df = new DecimalFormat("#.0000000");
		System.out.println(df.format(area));
		sc.close();
	}
}
