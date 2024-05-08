package ALLPROGRAMS;

import java.util.Scanner;

public class ipl 
{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	program p=new program();
	for(;;)
	{
		System.out.println("1.add team 2.remove team 3.exit");
		switch(p.sc.nextInt())
		{
		case 1:p.add_team();break;
		case 2:p.remove_team();break;
		case 3:return;
		
		}
	}
	
}
}
