package forloop.workings;

public class Forloop_images {
	public static void main(String[] args)
	{
		for(int row=9;row>=1;row--)
		{
			for(int col=row;col<=9;col++)
			{
				System.out.print(" ");
			}
			for(int col2=1;col2<=row;col2++)
			{
				System.out.print(row+" ");
			}
			System.out.println();
			
		}
			for(int row2=2;row2<=9;row2++)
			{
			for(int col=row2;col<=9;col++)
			{
				System.out.print(" ");
			}
			for(int col2=1;col2<=row2;col2++)
			{
				System.out.print(row2+" ");
				
		     }
			System.out.println();
			}
			
	}
}