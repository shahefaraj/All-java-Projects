package ALLPROGRAMS;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Book_Driver {
	Scanner sc=new Scanner(System.in);
	List l=new ArrayList();
	Date d=new Date();
	
	
	public void Add_book()
	{   
		System.out.println("enter  book id");
		int id=sc.nextInt();
		System.out.println("enter book title");
		String title=sc.next();
		System.out.println("enter release date");
		
		
		Book b=new Book(id,title);
		
		l.add(b);
		System.out.println("Book is Added");
		
	}
	public void result()
	{
		System.out.println("enter book id");
		int  id=sc.nextInt();
		
		
		
		for(int i=0;i<l.size();i++)
			{
			        Book b=(Book)l.get(i);
			        if(b.id==id)
			        {  System.out.println("enter book name/title");
			           String name=sc.next();
			         
			        	if(true )
			        	{
			        		 
			        	System.out.println(b.id+" "+b.title+" ");
			        	}
			        }
			        else
			        {
			        	System.out.println("data is not found");
			        }
			      
		
			
			}
			}

}
