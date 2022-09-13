package MultilevelInheritacnce;

public class ManagerClass extends EmployeeClass {

	int salary;
	String designation;
	
	void setManagerClassData(int salary,String designation) {
		this.salary=salary;
		this.designation=designation;
		
	}
	void display() {
		super.display();
		System.out.println(salary+" "+designation);
		
		
	}
}
