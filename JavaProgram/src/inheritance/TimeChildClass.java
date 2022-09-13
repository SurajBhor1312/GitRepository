package inheritance;

public class TimeChildClass extends MyDateParentClass {

	int hr,min,sec;
	
	void setTime(int hr,int min,int sec)
	{
		this.hr=hr;
		this.min=min;
		this.sec=sec;
	}
	
	void display()
	{
		System.out.println(dd+"/"+mm+"/"+yy+" : "+hr+":"+min+":"+sec+":");
	}
}
