package MainExampleOfCoveriant;

public class GrandFatherParentClass {

	private String firstname;
	private String middlename;
	private String lastname;
	
	
void setGrandFatherParentClass(String firstname, String middlename, String lastname)
	
	{
		this.firstname=firstname;
		this.middlename=middlename;
		this.lastname=lastname;
	}
 void display()
{

	System.out.println("SahdevBaba: "+firstname+"\nRamdevBaba :"+middlename+"\nVarma:"+lastname);

	}
}
