package com.vstl.methodOverriding;

public class BranchOfficePune extends HeadOffice {

	private static final int doubleEfficiency = 0;

	@SuppressWarnings("unused")
	public double promotion(int intStandardworkingHours, int intActualTimeWorked) {
		
		
		super.promotion(100, 70);
		
		//Since doubleEfficiency is Final, its value is not changed from 0. 
		//Hence its printing else part
		if(doubleEfficiency >=90) 
			System.out.println("Employee is Promoted for Pune branch");
		else 
			System.out.println("Employeed is not Promoted for Pune branch as Perfomance is low" );
		return doubleEfficiency;
		
	}
}
