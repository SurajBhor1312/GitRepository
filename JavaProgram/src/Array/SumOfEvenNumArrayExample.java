package Array;

import java.util.Scanner;

public class SumOfEvenNumArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the length of: "+a.length);
		System.out.println("Enter a array elements: ");
		for(int i=0;i<=size-1;i++)
		{
			a[i]=sc.nextInt();
			
		}
		int sum=0;
		System.out.println("Sum of even nomber: ");
		for(int i=0;i<=size-1;i++)
		{
			if(a[i]%2==0)
			{
				sum=sum+a[i];
			}
		}
		System.out.println(sum+" ");
	}

}
