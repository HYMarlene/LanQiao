package b_16T8;

import java.util.Scanner;

public class Main {
	public static String toBinary(String strHex) {
		StringBuffer s = new StringBuffer();
		for(int i = 0;i < strHex.length();i++)
		{
			switch (strHex.charAt(i)) {
			case '0':
				s.append("0000");
				break;
			case '1':
				s.append("0001");
				break;
			case '2':
				s.append("0010");
				break;
			case '3':
				s.append("0011");
				break;
			case '4':
				s.append("0100");
				break;
			case '5':
				s.append("0101");
				break;
			case '6':
				s.append("0110");
				break;
			case '7':
				s.append("0111");
				break;
			case '8':
				s.append("1000");
				break;
			case '9':
				s.append("1001");
				break;
			case 'A':
				s.append("1010");
				break;
			case 'B':
				s.append("1011");
				break;
			case 'C':
				s.append("1100");
				break;
			case 'D':
				s.append("1101");
				break;
			case 'E':
				s.append("1110");
				break;
			case 'F':
				s.append("1111");
				break;
			default:
				break;
			}
		}
		return s.toString();
	}
	
	public static String toOct(String strBin) {
		StringBuffer s = new StringBuffer();
		int k;
		if(strBin.substring(0, 3).equals("000"))
			k=3;
		else
			k=0;
		for(int i = k;i < strBin.length()-2;i+=3)
		{
			if((strBin.substring(i, i+3)).equals("000"))
				s.append("0");
			else if((strBin.substring(i, i+3)).equals("001"))
				s.append("1");
			else if((strBin.substring(i, i+3)).equals("010"))
				s.append("2");
			else if((strBin.substring(i, i+3)).equals("011"))
				s.append("3");
			else if((strBin.substring(i, i+3)).equals("100"))
				s.append("4");
			else if((strBin.substring(i, i+3)).equals("101"))
				s.append("5");
			else if((strBin.substring(i, i+3)).equals("110"))
				s.append("6");
			else if((strBin.substring(i, i+3)).equals("111"))
				s.append("7");
			}
		
		return s.toString();
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		String a = new String();

		int i=0;
		while(i<n)
		{
			a=sc.next();
			String strBin = toBinary(a);
			int len = strBin.length();
			if(len%3==1) strBin = "00"+strBin;
			if(len%3==2) strBin = "0"+strBin;
			String strOctal = toOct(strBin);
			System.out.println(strOctal);
			i++;
		} 
		sc.close();
	}
}
