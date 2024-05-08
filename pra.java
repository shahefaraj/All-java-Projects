package ALLPROGRAMS;

import java.util.Arrays;
import java.util.Scanner;

public class pra {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a array size");
		int a[]=new int [sc.nextInt()];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int min=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(min<a[i])
				{
					System.out.print(" "+a[i]);
				}
			}
		}
		
	}
}

	

