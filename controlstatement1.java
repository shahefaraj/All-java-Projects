package ALLPROGRAMS;
import java.util.Scanner;
public class controlstatement1
{public static void main(String[] args)
{
	System.out.println(evenodd());
}
public static String evenodd()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int a=sc.nextInt();
	if(a%2==0)
	{
		return "even";
		
	}
	else
	{
		return "odd";
	}
	
	
}


}






