package ALLPROGRAMS;

import java.util.Arrays;
import java.util.Scanner;

public class acc

{
	public static void main(String[] args) 
	
	{  
		String a="peek";
		String b="keep";
		if(a.length()==b.length())
		{
			char ch1[]=a.toCharArray();
			char ch2[]=b.toCharArray();
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			boolean result=Arrays.equals(ch1, ch2);
			if(result)
			{
				System.out.println(a+" "+b+" are anaGRam ");
				
			}
			else
			{
				System.out.println(a+" "+b+" not anagram");
			}
			
		}
		System.out.println(a+" and"+b+" are not anagram");
		
			
		
	}

}
