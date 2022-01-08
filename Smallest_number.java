package array.workings;

import java.util.Scanner;

public class Smallest_number {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println(" Enter size array ");
		int len=sc.nextInt();
		int[] num=new int[len];
		System.out.println("Enter array values ");
		for(int i=0;i<num.length;i++)
		{
			num[i]=sc.nextInt();
		}
		
			Smallest_number sn=new Smallest_number();
			sn.findSmall(num);
	
	}

	private void findSmall(int[] num)
	{
		int min=Integer.MAX_VALUE;
		for(int i=0;i<num.length;i++)
		{
			if(num[i]<min)
			{
				min=num[i];
			}
		}
		System.out.println("Smallest value of given array "+min);
		
	}

}
