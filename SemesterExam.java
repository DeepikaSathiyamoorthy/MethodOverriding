package com.vstl.methodOverriding;

public class SemesterExam {

	int intenglish = 72;
	int intscience = 83;
	int intmaths = 91;

	void exam() {
		
		double doublesumofsemone = intenglish+intmaths;
		float floatfirstsemresult = (float) (doublesumofsemone*100)/300; 
		System.out.println("Semester Exam Percentage: " + floatfirstsemresult +"%");
		}
}
