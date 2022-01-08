package forloop.workings;

public class For_loop_122333 {
	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=i;j<=5;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		for(int a=4;a>=1;a--)
		{
			for(int b=a;b<=5;b++)
			{
				System.out.print(" ");
			}
			for(int c=1;c<=a;c++)
			{
				System.out.print(a+" ");
			}
			System.out.println();
		}
	}

}
