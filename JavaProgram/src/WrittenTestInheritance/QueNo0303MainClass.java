//Que 3) 3rd Class)

package WrittenTestInheritance;

public class QueNo0303MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			
			QueNo0302IdProofClass pi=new QueNo0302IdProofClass();
		
			pi.setName("AadharCard");
			pi.setNo("1234 5678 9012");
			pi.setValidity(05/22);
		
			QueNo03PersonClass pc=new QueNo03PersonClass();
			pc.setId(01);
			pc.setName("GanguBai");
			pc.setAddress("Pune");
			pc.setContact("0987654321");
			pc.setId(101);
			
			if((pc.getAddress().equals("Pune")))
			{
				System.out.println(pc.getId()+"\n"+pc.getName()+"\n"+pc.Address+"\n"+pc.getContact()+"\n"+pi.getName()+"\n"+pi.getNo()+"\n"+pi.getValidity());
			}
			else
			{
				System.out.println("Null");
			}
	}

}
