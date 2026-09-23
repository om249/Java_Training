package Introduction;

public class First {

	public static void main (String [] args)
	{
		int a=20;
		
		if(a<=3)
		{
			System.out.println("Toddler");
		}
		else if(a>3 && a<=12)
		{ 
			System.out.println("Kid");
		}
		else if(a>12 && a<=18)
		{
			System.out.println("Teenager");
		}
		else
		{
			System.out.println("adult");
		}
	}
}
