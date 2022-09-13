package MultilevelInheritacnce;

public class PersonClass {
	String name;
    long contact;
	String add;
		void setPersonClassData(String name, long contact, String add)
	
	{
		this.name=name;
		this.contact=contact;
		this.add=add;
	}
 void display()
{

	System.out.println("Person Name: "+name+"\nPerson Contact no :"+contact+"\nPerson Address:"+add);
}
}
