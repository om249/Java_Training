package Introduction;

public class Stringg {
	public static void main (String[]args)
	{
		String name= "Omkar";
//		System.out.print(name);
		
		String name2="Omkar";
		String name3=new String("Omkar");
		System.out.println(name==name2);
		System.out.println(name==name3);
		System.out.println(name.equals(name3));
	
//		String rev="";
//		for(int i=0; i<name.length(); i++)
//		{
//			 
//			char ch=name.charAt(i);
//			rev= ch + rev;
//			
//		}
//		System.out.print(rev);
		
		
		for(int i=name.length()-1; i>=0;i--)
		{
			char ch=name.charAt(i);
			System.out.print(ch);
		}
	
	}
}
