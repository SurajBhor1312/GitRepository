package CoveriantInJava;

public class SonChildClass extends FatherParentClass{

	SonChildClass()
	{
		System.out.println("Inside Class Son Default Constructor");
	}
	SonChildClass(int a)
	{
		//Default Constructor of parent class
		System.out.println("Inside Son Class Parameterised Constructor "+a);
	}
	
	protected FatherParentClass display()
	{
		System.out.println("In Son class Display method");
		return new FatherParentClass();
	}
}
