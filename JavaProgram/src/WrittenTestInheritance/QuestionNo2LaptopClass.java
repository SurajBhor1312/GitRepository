/*Que 2nd)
1st Class)

Create Class Laptop which has variables noOfUSBPort, processorSpeed of type int. Create getter, setter methods for the variables. In main method,
create Laptop object 
set values of variables noOfUSBPort, processorSpeed using setter methods. 
print variables noOfUSBPort, processorSpeed using getter methods.
*/

package WrittenTestInheritance;

public class QuestionNo2LaptopClass {
	int NoOfUSBPort;
	String Speed;
	
	public int getNoOfUSDPort() {
		return NoOfUSBPort;
	}
	public void setNoOfUSDPort(int noOfUSDPort) {
		NoOfUSBPort = noOfUSDPort;
	}
	public String getSpeed() {
		return Speed;
	}
	public void setSpeed(String speed) {
		Speed = speed;
	}
}
