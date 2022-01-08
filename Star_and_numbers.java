package forloop.workings;

public class Star_and_numbers {
	public static void main(String[] args)
	{
		for(int row=1;row<=5;row++)
		{
				for(int col1=1;col1<=row-1;col1++)
				{
					System.out.print("  ");
				}
				
			    for(int col2=1;col2<=6-row;col2++)
				{
				System.out.print(row+" ");
				}
				System.out.println();
			}
		}
	}


