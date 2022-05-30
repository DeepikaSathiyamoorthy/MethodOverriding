package com.vstl.methodOverriding;

public class TestExam {

	public static void main(String[] args) {
		
		SemesterExam objSemExam = new SemesterExam();
		SemesterOne objSemOne = new SemesterOne();
		SemesterTwo objSemTwo = new SemesterTwo();
		
		new SemesterFive();
		objSemExam.exam();
		objSemOne.exam();
		objSemTwo.exam();
	}

}
