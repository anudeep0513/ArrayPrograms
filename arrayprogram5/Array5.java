package arrayprogram5;

import java.util.Scanner;

public class Array5 {

	public static void main(String[] args) 
	{
		int temp=5;
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		int[] a=new int[7];
		for (int i=0;i<=a.length-1;i++)
		{
			a[i]=s1.nextInt();
		}
		System.out.print("{");
		for (int i=0;i<=a.length-1;i++)
		{
			System.out.print(a[i]);
			System.out.print(",");
		}
		System.out.println("}");
		for (int i=0;i<=a.length-1;i++)
		{
			if (a[i]==temp)
			{
				System.out.println(a[i]);
				System.out.println("yes,number "+temp+" is present in the given array");
			}
		}
	}

}
