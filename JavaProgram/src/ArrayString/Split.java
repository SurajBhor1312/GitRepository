package ArrayString;

import java.util.StringTokenizer;

public class Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		StringTokenizer st=new StringTokenizer("Hello$World");
		
		System.out.println(+st.countTokens());
		while(st.hasMoreElements())
		{
			String token=st.nextElement().toString();
			System.out.println(token);
		}
		
	}

}
