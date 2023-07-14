package arrayprograms;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		int[] b=new int[4];
		for (int i=0;i<=b.length-1;i++) {
			b[i]=s1.nextInt();
		}
		for (int j=0;j<=b.length-1;j++)
		{
			System.out.println(b[j]);
		}
		
        
	}

}
