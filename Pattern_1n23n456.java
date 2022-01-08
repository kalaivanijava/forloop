package forloop.workings;

public class Pattern_1n23n456 {
	public static void main(String[] args)
	{
		int value=1;
		for(int j=4;j>=1;j--)
		{
		for(int i=j;i>=1;i--)
		{
			System.out.print(value+" ");
			value++;
		}
	
		System.out.println();
	}

}
}