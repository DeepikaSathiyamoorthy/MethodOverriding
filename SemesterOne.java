package com.vstl.methodOverriding;

public class SemesterOne extends SemesterExam{

	void exam() {
		
		double doublesumofsemone = intenglish+intmaths+intscience;
		float floatfirstsemresult = (float) (doublesumofsemone*100)/300; 
		System.out.println("First Semester Percentage: " + floatfirstsemresult +"%");
	}
}
