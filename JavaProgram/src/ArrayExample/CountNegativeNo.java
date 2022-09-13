package ArrayExample;

import java.util.Scanner;

public class CountNegativeNo {
	public static void main(String[] args)
{
	int Size,i;
	int positiveCount=0;
	int negativeCount=0;
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Please enter number of elements in the array: ");
	Size=sc.nextInt();
	int[] a=new int[Size];
	System.out.println("Please Enter "+Size+" elements of an Array: ");
	for(i=0;i<Size;i++)
	{
		a[i]=sc.nextInt();
		
	}
	for(i=0;i<Size;i++)
	{
		for(i=0;i<Size;i++)
		{
				a[i]=sc.nextInt();
				
		{
				for(i=0;i<Size;i++)
				{
					if(a[i]>=0)
					{
						positiveCount++;
					}
					else
					{
						negativeCount++;
					}
				}
		System.out.println("Total Number of Positive Number in this Array :"+positiveCount);
		
		System.out.println("Total Number of Negative Number in this Array :"+negativeCount);
	}
		
}
}
}
}

