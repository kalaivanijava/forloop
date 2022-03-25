package looping.finish;

public class ForLoopStars {
	public static void main(String[] args)
	{
		ForLoopStars f=new ForLoopStars();
		f.star1();
		f.star2();
		f.star3();
		f.star4();
		f.diamond();
		f.diamond2();
	}

	private void diamond2()
	{
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=i;k<=4;k++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
		
	}

	private void diamond() 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=i+1;j<=5;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
		
	}

	private void star4() 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=2;j<=i;j++)
			{
				System.out.print("  ");
			}
			for(int k=i;k<=5;k++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		
	}

	private void star3() 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=i+1;j<=5;j++)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("@"+" ");
			}
			System.out.println();
		}
		
	}

	private void star2()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("$"+" ");
			}
			for(int k=i+1;k<=5;k++)
			{
				System.out.print("  ");
			}
			for(int m=i+1;m<=5;m++)
			{
				System.out.print("  ");
			}
			for(int n=1;n<=i;n++)
			{
				System.out.print("$"+" ");
			}
			System.out.println();
		}
		
	}

	private void star1()
	{
	for(int i=1;i<=5;i++)
	{
		for(int j=i;j<=5;j++)
		{
			System.out.print("*"+" ");
		}
		for(int z=2;z<=i;z++)
		{
			System.out.print("  ");
		}
		for(int k=2;k<=i;k++)
		{
			System.out.print("  ");
		}
		for(int l=i;l<=5;l++)
		{
			System.out.print("*"+" ");
		}
		System.out.println();
	}
		
	}

}
