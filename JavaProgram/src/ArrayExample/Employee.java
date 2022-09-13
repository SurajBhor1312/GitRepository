package ArrayExample;

public class Employee {
int id,salary;
String name,dept;

Employee(int id,String name,String dept,int salary){
	this.id=id;
	this.name=name;
	this.dept=dept;
	this.salary=salary;
}


public String toString()
{  
	return "\n Id is "+id+"\n Name is "+name+"\n Dept name is "+dept+"\n Salary is "+salary;
			}
}
