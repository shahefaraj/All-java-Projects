package ALLPROGRAMS;

import java.util.Scanner;

public class assiment1 {public static void main(String[] args)
{
	System.out.println(sectohrs()+" inhrs");
}
public static float mintohrs()
{
	Scanner a=new Scanner(System.in);
	System.out.println("enter a min");
	float min=a.nextFloat();
	float hrs=min/60;
	return hrs;
}
public static float hrstomin()
{
	Scanner b=new Scanner(System.in);
	Scanner hrs=b=new Scanner(System.in);
	System.out.println("enter hrs");
	float hrs1=b.nextFloat();
	float min1= hrs1 * 60;
	return min1;
	
}
public static float secintomin()
{ Scanner c=new Scanner(System.in);
	System.out.println("enter sec");
	float sec=c.nextFloat();
	float min2=sec/60;
	return min2;
}
public static float sectohrs()
{
	Scanner d=new Scanner(System.in);
	System.out.println("enter sec");
	float sec=d.nextFloat();
	float hrs2=sec/3600;
	return hrs2;
}
}


