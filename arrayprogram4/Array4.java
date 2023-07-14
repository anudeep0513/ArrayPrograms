package arrayprogram4;

import java.util.Scanner;

public class Array4 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		String [] s2=new String[5];
		for(int i=0;i<=s2.length-1;i++)
		{
			 s2[i]=s1.next();
		}
		for (int i=0;i<=s2.length-1;i++)
		{
			System.out.println(s2[i]);
		}
		System.out.print("{");
		for (int i=0;i<=s2.length-1;i++)
		{
			if (i%2==0)
			{
				System.out.print(s2[i]);  //printing even index values
				System.out.print(",");
			}
		}
		System.out.println("}");

	}

}
