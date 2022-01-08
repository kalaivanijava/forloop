package array.workings;

import java.util.Scanner;

public class Decimal_octal {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter number ");
		int num=sc.nextInt();
		Decimal_octal de=new Decimal_octal();
		String result=de.octal(num);
		System.out.println(" The octal "+result);

	}

	private String octal(int num) {
		String s=" ";
		while(num>0)
		{
			int rem=num%8;
			s=rem+s;
			num=num/8;
		}
		
		return s;
	}

}
