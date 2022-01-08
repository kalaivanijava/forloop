package forloop.workings;

public class Prime_number_forloop {
	public static void main(String[] args) {
		Prime_number_forloop pm=new Prime_number_forloop();
		pm.primenumber(10,40);
	}

	private void primenumber(int firstnumber,int lastnumber) {
		{
			int startnumber=firstnumber;
			int digits=0;
			
			for(;firstnumber<=lastnumber;firstnumber++)
			{
				int count=0;
				for(int p=1;p<=firstnumber;p++)
				{
					if(firstnumber%p==0)
					{
						count=count+1;
					}
				}
					
					if(count==2)
					{
						System.out.println(firstnumber+" is prime");
						digits=digits+1;
					}
				}
			System.out.println(" Total prime number between "+startnumber+" and "+lastnumber+" is " +digits);
			}
		}
		
	}


