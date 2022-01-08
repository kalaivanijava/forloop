package forloop.workings;

public class For_loop_3forloops {
	
	public static void main(String[] args)
	{
		for(int row=1;row<=5;row++)
		{
				for(int col1=1;col1<=row-1;col1++)
				{
					System.out.print("  ");
				}
				
			    for(int col2=5;col2>=row;col2--)
				{
				System.out.print(col2+" ");
				}
				
			
		        for(int col3=row+1;col3<=5;col3++)
		        {
		        System.out.print(col3+" ");
		        }
		        System.out.println();
}
}
}
