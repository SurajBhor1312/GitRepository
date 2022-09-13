/*Que 3rd) 1st class) Create a class Person(id,name,contact,address,idproof[])
Create class IdProof (name,number,validity). 
Display all the persons name contact address who stay in pune and have adhaar card as idproof.
*/

package WrittenTestInheritance;

public class QueNo03PersonClass {
	int id;
	String name,Address,Idprooftype;
	String Contact;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getIdprooftype() {
		return Idprooftype;
	}
	public void setIdprooftype(String idprooftype) {
		Idprooftype = idprooftype;
	}
	public String getContact() {
		return Contact;
	}
	public void setContact(String contact) {
		Contact = contact;
	}
}
