package PackageString;

import java.util.Scanner;

public class MovieDetails {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Array of movie : ");
	int size=sc.nextInt();
	Movie m[]=new Movie[size];
	
	for(int i=0;i<size;i++)
	{
		System.out.println("Enter the Movie Name : ");
		String moviename = sc.next();
		
		System.out.println("Enter Movie ID : ");
		int movieID = sc.nextInt();
		
		System.out.println("Enter the Producer Name : ");
		String mproducer = sc.next();
		
		System.out.println("Enter the Release Year : ");
		int mreleaseY = sc.nextInt();
	
		System.out.println("Enter the Box Office Collection : ");
		int mboxofficeCollection = sc.nextInt();
	
		m[i]=new Movie(moviename,movieID,mproducer,mreleaseY,mboxofficeCollection);
	}
	
	for(Movie mov:m)
	{
		if(mov.mboxofficeCollection>=5000000)
			System.out.println("Producer Name: "+mov.mproducer+"\nMovie box office Collection: "+mov.mboxofficeCollection);
	}
	}

}


