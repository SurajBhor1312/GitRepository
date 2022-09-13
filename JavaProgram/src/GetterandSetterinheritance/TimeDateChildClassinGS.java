package GetterandSetterinheritance;

public class TimeDateChildClassinGS extends MyDateParentClassinGS {
	private int hr;
	private int min;
	private int sec;
	
		public void setHr(int hr)
		{
			this.hr=hr;
		}
		public int getHr()
		{
			return hr;
		}
		public void setMin(int min)
		{
			this.min=min;
		}
		public int getMin()
		{
			return min;
		}
		public void setSec(int sec)
		{
			this.sec=sec;
		}
		public int getSec()
		{
			return sec;
		}
}
