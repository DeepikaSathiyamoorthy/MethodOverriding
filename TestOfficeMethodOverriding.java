package com.vstl.methodOverriding;

public class TestOfficeMethodOverriding {

	public static void main(String[] args) {
		
		//HeadOffice objHeadOffice = new HeadOffice();
		BranchOfficePune objPuneOffice = new BranchOfficePune();
		BranchOfficeMumbai objMumbaiOffice = new BranchOfficeMumbai();
		System.out.println(objPuneOffice.promotion(178, 80));
		System.out.println(objMumbaiOffice.promotion(190, 100));
		
	}

}
