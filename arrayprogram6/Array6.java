package arrayprogram6;

import java.util.Scanner;

public class Array6 {
	static int i;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		int[] a=new int[5];
		int[] b=new int[5];
		int[] c=new int[10];
		for (int i=0;i<=a.length-1;i++)
		{
			a[i]=s1.nextInt();
		}
		for (int i=0;i<=a.length-1;i++)
		{
			b[i]=s1.nextInt();
		}
		
		System.out.println();
		for (int j=0;j<=a.length-1;j++)
		{
			c[i]=a[j];
			i++;
		}
		for (int j=0;j<=b.length-1;j++)
		{
			c[i]=b[j];
			i++;
		}
		System.out.println();
		System.out.print("{");
		for (int j=0;j<=c.length-1;j++)
		{
		   System.out.print(c[j]);
		   System.out.print(",");
		}
		System.out.println("}");
	}

}
