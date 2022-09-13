package ArrayExample;

import java.util.Scanner;

public class ReplaceNumbersInArray {

	void replaceNegativeNo(int a[], int Size)
	{
		System.out.println("Repace of negative numbers : ");
		int i;
		for(i=0;i<Size;i++)
		{
			if(a[i]<0)
			{
				a[i]=a[i-1]*a[i-1];
			}
			System.out.println(a[i]);
			
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReplaceNumbersInArray Array=new ReplaceNumbersInArray();
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter number of elements in the array: ");
		int Size=sc.nextInt();
		int a[]=new int[Size];
		System.out.println("Please Enter elements of an Array: ");
		for(int i=0;i<Size;i++)
		{
			a[i]=sc.nextInt();
		}
		Array.replaceNegativeNo(a,Size);
		/* System.out.println(a[Size]+" "); */
	}

}
