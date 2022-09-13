package PackageString;

public class Movie {

	int movieID,mreleaseY,mboxofficeCollection;
	String moviename,mproducer;
	
	
	Movie(String moviename,int movieID,String mproducer,int mreleaseY,int mboxofficeCollection)
	{
		this.moviename=moviename;
		this.movieID=movieID;
		this.mproducer=mproducer;
		this.mreleaseY=mreleaseY;
		this.mboxofficeCollection=mboxofficeCollection;
	}
	public String toString()
	{
		return moviename+" "+movieID+" "+mproducer+" "+mreleaseY+" "+mboxofficeCollection;
		
	}
}
