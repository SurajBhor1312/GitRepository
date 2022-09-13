package MultilevelInheritacnce;

public class EmployeeClass extends PersonClass {
	String comp;
	int id;
	String dept;
		void setEmployeeClassData(int id, String comp, String dept)
	
	{
		this.id=id;
		this.comp=comp;
		this.dept=dept;
	}
 void display()
{
	super.display();
	System.out.println("Employee ID: "+id+"\nEmployee comp :"+comp+"\nDepartment:"+dept);
}
}

