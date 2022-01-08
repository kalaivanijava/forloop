package forloop.workings;

public class Fibannoci_series {
	public static void main(String[] args)
	{
				
	int f=-1;
	int s=1;
	int t=0;
		int count=1;	
		while(count<=8)
		{
			t=s+f;
			System.out.println(t);
			
			int primenumber=0;
			for(int prime=1;prime<=t;prime++)
			{
				
				if(t%prime==0)
				{
					primenumber=primenumber+1;
				}
									
			}
			f=s;
			s=t;	
			count++;	
			
		if(primenumber==2)
		{
			System.out.println( "Number " +t+" is a prime number");
		}
		}
	}
	}

