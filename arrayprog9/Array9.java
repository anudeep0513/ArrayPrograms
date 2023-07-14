package arrayprog9;

import java.util.Scanner;

public class Array9 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        Scanner s1=new Scanner(System.in);
        System.out.println("enter the size of array");
        int size=s1.nextInt();
        int[] a=new int[size];
        System.out.println("print the nth highest number");
        int nth=s1.nextInt();
        System.out.println("enter the array elements");
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
        			int temp=a[j];
        			a[j]=a[i];
        			a[i]=temp;
        		}
        	}
        }
        for (int i=0;i<=a.length-1;i++)
        {
        	System.out.println(a[i]);
        }
        for (int i=a.length-1;i>0;i--)
        {
        	if (i==(a.length-nth))
        	{
        		System.out.println();
        		System.out.println(nth +"th highest number is "+a[i]);
        	}
        	else if(nth>a.length-1)
        	{
        		System.out.println("enter correct nth value");
        	}
        }
	}

}
