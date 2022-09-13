package inheritance;

public class MyDateMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TimeChildClass t=new TimeChildClass();
		t.setDate(16, 8, 2022);
		t.setTime(15, 35, 20); 
		t.display();
	}

}
