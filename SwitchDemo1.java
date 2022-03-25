package looping.finish;

import java.util.Scanner;

public class SwitchDemo1 {
	public static void main(String[] args)
	{
		SwitchDemo1 sd=new SwitchDemo1();
		//sd.days();
		//sd.ifDays();
		//sd.doWhileLoop();
		sd.calculate();
		
	}
	
	private void calculate()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println(" Enter the first number ");
	int num1=sc.nextInt();
	System.out.println(" Enter the 2 nd number ");
	int num2=sc.nextInt();
	/*if(num2==0)
	{
		System.out.println(" Enter again ");
		calculate();
	}*/
	System.out.println(" Enter 1 2 3 4");
	int cal=sc.nextInt();
	
	{
		switch(cal)
		{
		case 1:
			System.out.println(num1+num2);
			break;
		case 2:
			System.out.println(num1-num2);
		break;
		default:
			System.out.println(" retry");
			
		}	
	}		
		
	}

	private void doWhileLoop() 
	{
		int i=1;
     do 
     {
    	System.out.println("You are enter "+i); 
    	i--;
     }while(i>10);
		
	}

	private void ifDays() {
		Scanner sc=new Scanner(System.in);
		System.out.println(" day number is  ");
		int day=sc.nextInt();
		if(day==1)
		{
			System.out.println(" Monday");
		}
		else if(day==2)
		{
			System.out.println(" tuesday ");
		}
		else if(day==3)
		{
			System.out.println(" Wednesday ");
		}
		else if(day==4)
		{
			System.out.println(" Thursday ");
		}
		else if(day==5)
		{
			System.out.println(" friday ");
		}
		else
		{
			System.out.println(" Enter number between 1 to 5");
		}
		
	}

	private void days()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println(" day number  ");
	int day=sc.nextInt();
	
	switch(day)
	{
	case 1:
		System.out.println(" monday ");
		break;
	case 2:
		System.out.println( " Tuesday ");
		break;
	case 3:
		System.out.println(" wednesday ");
	    break;
	case 4:
		System.out.println(" Thursday ");
	    break;
	case 5:
		System.out.println(" Friday ");
	    break;
	case 6:
		System.out.println(" Saturday ");
	    break;
	case 7:
		System.out.println(" Sunday ");
	    break;
	default:
		System.out.println(" please  Enter 1 to 7 ");
	}
		
	}

}
