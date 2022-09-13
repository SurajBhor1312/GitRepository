package ArrayString;
import java.util.Scanner;
public class WordAtWhatNo {

	public static void main(String[] args)
		    {
		      String s=" Java is a good Programming language";
		      int count=0;
		      char ch;
		       Scanner sc= new Scanner(System.in);
		      ch=sc.next().charAt(0);
		    
		      char ch1[]=s.toCharArray();
		      
		      
		      for(int i=0;i<ch1.length;++i)
		      {
		    	  if(ch1[i]==ch)
		    	  {
		    		  count++;
		    		  
		    		 
		    	  }
		    	  
		      }
		      System.out.println(ch+" \n"+count); 
		      
}
}
