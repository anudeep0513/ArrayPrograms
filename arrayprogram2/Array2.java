package arrayprogram2;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args)  
	{
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		int[] a=new int[5];  //initialization of  an array
		for (int i=0;i<=a.length-1;i++)
		{
			a[i]=s1.nextInt();
		}
		System.out.print("{");
		int [] b=new int[5];
		for (int i=0;i<=a.length-1;i++)
		{
			b[i]=a[i];
			System.out.print( b[i]);
		}
		System.out.println("}");
		System.out.print("array a[] is copied into array b[]");

	}
}
