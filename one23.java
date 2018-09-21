//import java.io.*;
import java.util.Scanner;
class A
{
	public static void main(String args[])
	{
		Scanner z=new Scanner(System.in);
		int r=0;
		String f;		
		char y;
		System.out.println("Enter the Number : ");
		f=z.next();
		for(int i=0;i<f.length();i++)
		{
			y=f.charAt(i);
			r=Integer.parseInt(f.valueOf(y));
			if(r==0)
			{
				System.out.print("zero"+" ");
			}
			else if(r==1)
			{
				System.out.print("one"+" ");
			}
			else if(r==2)
			{
				System.out.print("two"+" ");
			}
			else if(r==3)
			{
				System.out.print("three"+" ");
			}
			else if(r==4)
			{
				System.out.print("four"+" ");
			}
			else if(r==5)
			{
				System.out.print("five"+" ");
			}
			else if(r==6)
			{
				System.out.print("six"+" ");
			}
			else if(r==7)
			{
				System.out.print("seven"+" ");
			}
			else if(r==8)
			{
				System.out.print("eight"+" ");
			}
			else if(r==9)
			{
				System.out.print("nine"+" ");
			}
		}
	}
}