package ALLPROGRAMS;
import java.util.Scanner;
public class whileloop {

	public static void main(String[] args)
	{
		Scanner s=new Scanner (System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int sum=0;
		while(a<b)
		{
			if(b%a==0)
			{
				System.out.println(a+"prime");
				sum=sum+a;
			}
			
			
			a++;
		}
		System.out.println(sum);
		if(sum==b)
		{
			System.out.println("petfect");
		}
		else
		{
			System.out.println("not perfct");
		}
		
	}

}
