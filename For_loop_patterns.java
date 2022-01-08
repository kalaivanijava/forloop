package forloop.workings;

public class For_loop_patterns {
	public static void main(String[] args)
	 {
		    for(int row=1;row<=4;row++)
		    {
		        for(int col=row;col<=4;col++)
		        {
		        int i=3;
		        for(int l=1;l<=row;l++)
		        {
		            System.out.print(col+" ");
		            col=col+i;
		            i--;
		        }
		        System.out.println();
		        }
		 
		    }
		 
		} 
}

	



