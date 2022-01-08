package forloop.workings;

public class Forloop_telegram {
	public static void main(String[] args)
	{
		for(int row=1;row<=5;row++)
		{
			for(int col=row;col<=5;col++)
			{
				System.out.print("  ");
				
			}
			int n=0;
			for(int col2=1;col2<=row;col2++)
			{
				
				System.out.print(col2+" ");
				n++;
				
			}
			System.out.println();
			
		}
	}

}
