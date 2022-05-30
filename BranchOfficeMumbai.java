package com.vstl.methodOverriding;

public class BranchOfficeMumbai extends HeadOffice {

	public double promotion(int intStandardworkingHours, int intActualTimeWorked) {
		
		double doubleEfficiency = (double)((intStandardworkingHours/intActualTimeWorked)*100);
	
		if(doubleEfficiency >=90) {
			System.out.println("Employee is Promoted for Mumbai branch");
		} else {
			System.out.println("Employeed is not Promoted for Mumbai branch as Perfomance is low" );
		}return doubleEfficiency;
	
	}
}
