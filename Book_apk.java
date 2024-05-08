package ALLPROGRAMS;

public class Book_apk 
{
	public static void main(String[] args)
	{
		Book_Driver bd=new Book_Driver();
		for(;;)
		{
			System.out.println("1.add 2.result 3.return");
			switch(bd.sc.nextInt())
			{
			case 1:bd.Add_book();break;
			case 2:bd.result();break;
			case 3:return;
			}
		}
		
	}

}
