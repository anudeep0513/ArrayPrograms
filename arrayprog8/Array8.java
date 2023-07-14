package arrayprog8;

public class Array8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //  System.out.println("enter the size");
       // int size1=s1.nextInt();
        int[] a= {7,3,9,1,8,4,2,6,10,11,13,19,14,18,15,17,16,20,22,25,23,24,26,29,21};
       // for (int i=0;i<=a.length-1;i++)
        //{
        	//a[i]=s1.nextInt();
        //}
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
        int j=0;
        try {
        for (int i=1;i<=30;i++)
         {
        	 if (i==a[j])
        	 {
        		 j++;
        	 }
        	 else
        	 {
        		 System.out.println("the missing number is "+ i);
        	 }
         }
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
        	System.out.println("missing numbers are finded");
        }
	}

}
