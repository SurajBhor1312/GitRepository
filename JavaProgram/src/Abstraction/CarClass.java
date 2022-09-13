package Abstraction;

public abstract class CarClass
{
	String color;
	int price;

void setColor(String color)
{
	this.color=color;
}
public String getColor() {
	return color;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}

void wheelNo()
{
	System.out.println("4 Wheels");
}
void headLights()
{
	System.out.println("2 Head lights");
	
}
abstract void  engine();
abstract void features();
abstract void dashBoard();

}