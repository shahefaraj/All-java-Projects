package ALLPROGRAMS;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class program 
{
	Scanner sc=new Scanner(System.in);
	List l=new ArrayList();
	public void add_team()
	{
         System.out.println("enter team name");
         String name=sc.next();
         System.out.println("enter points");
         double point=sc.nextDouble();
         char resu[]=new char[1];
         team t=new team(name,point,resu);
         for(int i=0;i<resu.length;i++)
        	 {
        	 resu[i]=sc.next().charAt(0);
        	 }
         l.add(t);
         System.out.println("team is added");
        	 }
	public void remove_team()
	{
		System.out.println("enter a team");
		String name=sc.next();
		for(int i=0;i<l.size();i++)
		{
		team	t=(team)l.get(i);	
		if(t.name.equals(name))
		{
			l.remove(t);
			System.out.println("team is removed");
			return;
			
		}
		
		}
		System.out.println("team not found");
	}
	public void filter_team()
	{
		
	}

}
