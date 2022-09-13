package GetterandSetterinheritance;

import inheritance.TimeChildClass;

public class MyDateMainClassinGS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TimeDateChildClassinGS t=new TimeDateChildClassinGS();
		t.setDd(10);
		t.setMm(10);
		t.setYy(2021);
		t.setHr(12);
		t.setMin(55);
		t.setSec(45);
		
		System.out.println(t.getDd()+"/"+t.getMm()+"/"+t.getYy()+"/"+t.getHr()+":"+t.getMin()+":"+t.getSec());
	}
	}
