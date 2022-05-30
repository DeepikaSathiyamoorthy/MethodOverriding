package com.vstl.methodOverriding;

public class HeadOffice {

	public double promotion(int intStandardworkingHours, int intActualTimeWorked) {
		
		double doubleEfficiency = (double)((intStandardworkingHours / intActualTimeWorked)*100);
		System.out.println("Performance based Promotion");
		
		//System.out.println(doubleEfficiency);
		
		if(doubleEfficiency >=90)
			System.out.println("Employee is Promoted for Head Office");
		else 
			System.out.println("Employeed is not Promoted for HeadOffice as Perfomance is Low");
		return doubleEfficiency;
	}
	
	
}
