package Introduction;

public class loop {
	public static void main(String[]args)
	{
		
int n=5;
//for(int i=0; i<n; i++)
//{
//	for(int j=0; j<n; j++)
//	{
//		if (i==0 || i==n-1 || j==n/2)
//		{
//		System.out.print("*");
//		
//		}
//		else
//		{
//			System.out.print(" ");
//		}
//	}
//	System.out.println();
//}

for (int i=1; i<=n; i++){
	for (int j=1; j<=i ; j++)
	{
		System.out.print(j+" ");
	}
	System.out.println();
}
}
}


