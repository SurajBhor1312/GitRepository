package ArrayExample;

import java.util.Arrays;

public class ArraySort {

	void sorting(int a[])
	{
		int len=a.length;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
			if(a[j]>a[j+1])
			{
			int temp=a[j];
			a[j]=a[j+1];
			a[j+1]=temp;
			}
		}
	}
		System.out.println(Arrays.toString(a));
		
		System.out.println("Second Higest Element: "+a[len-2]);
		System.out.println("Third Minimum Element: "+a[2]);
		
	}
	
	public static void main(String[] args)
	{
		int arr[] = {54, 78, 23, 07, 89, 45, 67, 25, 12, 98, 72, 05};


		ArraySort as=new ArraySort();
		as.sorting(arr);
	}
}
