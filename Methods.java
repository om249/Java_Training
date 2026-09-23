/*
Consider you are designing one employee login system which will consist of 4 methods
Method 1 -> Will print Employee logged in -> Hardcoded value and it will not return anything and you will not pass any params
method 2 -> Will print accessing dashboard -> User you will pass as a param but it will not return anything
method 3 -> Will return the session on time of the user
method 4 -> It will print whether user is authenticated or not -> You will pass username as a param
*/
package Introduction;

import java.util.*;
class LoginSys
{
	void login() {
		System.out.println("I am Logged In");
	}
	
	void dashboard(String Name) {
		System.out.println(Name +" accessing dashboard");
	}
	
	int LogginTime()
	{
		return 12;
	}
	
	void Authentication(String Username)
	{
		if(LogginTime()<12)
		{
		System.out.println(Username + "...Is Authenticated ");
		}
		else
		{
			System.out.println(Username + "...Is Not Authenticated ");
		}
	}
}
public class Methods {
	public static void main(String [] args)
	{
	LoginSys lg=new LoginSys();
	Scanner sc=new Scanner(System.in);
	
	lg.login();
	lg.dashboard("Sai");
	System.out.println("Working hours are : " + lg.LogginTime());
	lg.Authentication("SAI999");
}
}
