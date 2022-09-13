/*Que no2) 
 Class 2ndnad MainClass
 */


package WrittenTestInheritance;

public class QuestionNo2MainLaptopClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuestionNo2LaptopClass lc=new QuestionNo2LaptopClass();
		lc.setNoOfUSDPort(07);
		lc.setSpeed("150 mbps");
		
		System.out.println("No of USB port are: "+lc.getNoOfUSDPort()+"\nOverall Internet Speed in per Sec is: "+lc.getSpeed());
	}

}
