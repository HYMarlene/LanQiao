package c_complex;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char op = sc.next().charAt(0);
		 double a,b,c,d;
	     a= sc.nextDouble();
	     b= sc.nextDouble();
	     c= sc.nextDouble();
	     d= sc.nextDouble();
	     
	     if (op=='+') {
	    	 System.out.printf("%.2f+%.2fi",a+c,b+d);
	     }
	     if (op=='-') {
	    	 System.out.printf("%.2f+%.2fi",a-c,b-d);
		 }
	     if (op=='*') {
	    	 System.out.printf("%.2f+%.2fi",a*c-b*d,a*d+b*c);
		 }
	     if (op=='/') {
	    	 System.out.printf("%.2f+%.2fi",(a*c+b*d)/(c*c+d*d),(b*c-a*d)/(c*c+d*d));
		 }
	}
}
