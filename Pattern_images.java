package forloop.workings;

public class Pattern_images {
public static void main(String[] args)
{
	for(int row=5;row>=1;row--)
	{
		if(row%2==0)
		{
			continue;
		}
		for(int col1=2;col1<=row;col1++)
		{
			System.out.print(" ");
		}
		for(int col2=5;col2>=row;col2--) 
		{
			
			System.out.print("*"+" ");
		}
	
		    System.out.println();
	}
				
		 for(int row=4;row>=1;row--)
		{
			 if(row%2==0)
				{
					continue;
				}
			 for(int col1=row;col1<=4;col1++)
			 {
				 System.out.print(" ");
			 }

				for(int col2=1;col2<=row;col2++)
				{
				System.out.print("*"+" ");
				}
				System.out.println();
     }

		
		
	}
}


