package Introduction;

import java.util.Scanner;

public class UseInput {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
//		int i=sc.nextInt();
//		System.out.println(i);
		String a=sc.nextLine();
		char c=a.charAt(4);
		System.out.println(c);
	}
}
