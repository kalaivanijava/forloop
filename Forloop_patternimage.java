package forloop.workings;

public class Forloop_patternimage
{
	public static void main(String[] args)
	{
 for(int r1=1;r1<=5;r1++)
 {
	 for(int c1=5;c1>=r1;c1--)
	 {
		 System.out.print(r1);
	 }
	 for(int r2=2;r2<=r1;r2++)
	 {
		 System.out.print("  ");
	 }
	  for(int c1=5;c1>=r1;c1--)
	 {
		 System.out.print(r1);
	 } 
 
 System.out.println();
 }
 
 
	 for(int r2=4;r2>=1;r2--)
	 {
		 for(int c2=5;c2>=r2;c2--)
		 {
		 System.out.print(r2);
	    }
	 
	 for(int r3=2;r3<=r2;r3++)
	 {
		 System.out.print("  ");
	 }
	  for(int c1=5;c1>=r2;c1--)
	 {
		 System.out.print(r2);
	 } 
	  
	System.out.println();
	 }
}
	
}
