package forloop.workings;

public class Forloop_0101 {
	public static void main(String[] args)
	{
	for(int i=1;i<=5;i++)
	{
		for(int k=4;k>=i;k--)
	
	    {
			System.out.print(" ");
	    }
			
		for(int j=1;j<=i;j++)
		{
			if(i%2==0)
			{
				System.out.print(1+" ");
			}
			else
			{
				System.out.print(0+" ");
			}
		}
		
		System.out.println();
	}


}
}
