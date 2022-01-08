package forloop.workings;

public class Forloop_ABBCCC {
	public static void main(String[] args)
	{
		for(char row='A';row<='E';row++)
		{
			for(char col1='A';col1<=row;col1++)
			{
				System.out.print(row+" ");
			}
			for(char col2=row;col2<='D';col2++)
			{
				System.out.print("  ");
			}
			for(char col2=row;col2<='D';col2++)
			{
				System.out.print("  ");
			}
			for(char col3='A';col3<=row;col3++)
			{
				System.out.print(row+" ");
			}
			System.out.println();
		}
		for(char row2='D';row2>='A';row2--)
		{
			for(char col1='A';col1<=row2;col1++)
			{
				System.out.print(row2+" ");
			}
			for(char col2='D';col2>=row2;col2--)
			{
				System.out.print("  ");
			}
			for(char col2='D';col2>=row2;col2--)
			{
				System.out.print("  ");
			}
			for(char col3='A';col3<=row2;col3++)
			{
				System.out.print(row2+" ");
			}
			System.out.println();
			
		
		}
	}

}
