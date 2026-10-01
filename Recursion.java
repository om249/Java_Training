package Introduction;

class Recurse
{
	public void print(int n)
	{
		if(n==0)
			return;
		System.out.println(n);
		print(n-1); 
		System.out.println(n);		
		
	}
}
	

public class Recursion {
	public static void main(String [] args)
	{
		Recurse re=new Recurse();
		re.print(3);
	}
}
