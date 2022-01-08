package forloop.workings;

public class patter_1n23n345n4567 {
	public static void main(String[] args)
	{
		int value=1;
		
		for(int j=1;j<=10;j=j+2)
		{
		for(int i=value;i<=j;i++)
		{
			System.out.print(i+" ");
		
		}
		System.out.println();
		value++;
		}
		
	}

}

