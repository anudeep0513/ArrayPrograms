package arrayprogram3;

import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		double[] a=new double[6];  // initialization of array with double values
		for (int i=0;i<=a.length-1;i++)
		{
			a[i]=s1.nextDouble();
		}
		System.out.print("{");
		for (int i=0;i<=a.length-1;i++)
		{
			System.out.print(a[i]);
			System.out.print(",");
		}
		System.out.println("}");
		System.out.print("{");
		for (int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]);  //reversing given array 
			System.out.print(",");
		}
		System.out.println("}");
	}

}
