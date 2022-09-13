package Abstraction;

public abstract class CarBalenoMainClass {

	public static void main(String[] args )
	{
		Baleno b=new Baleno();
		
		b.setColor("red");
		b.setPrice(16000);
		b.engine();
		b.headLights();
		b.dashBoard();
		b.features();
		b.wheelNo();
		System.out.println("price of Baleno is: "+b.getPrice());
		System.out.println("Color of Baleno is: "+b.getColor());
	}
}
