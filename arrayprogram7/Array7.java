package arrayprogram7;

import java.util.Scanner;

public class Array7 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		int[] a=new int[9];
		for (int i=0;i<=a.length-1;i++)
		{
			a[i]=s1.nextInt();
		}
		for (int i=0;i<=a.length-1;i++)
		{
			for (int j=i+1;j<=a.length-1;j++)
			{
				if (a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
	    for (int i=0;i<=a.length-1;i++)
	    {
	    	System.out.println(a[i]);
	    }
	   // System.out.println(a[0]);
	}
}
