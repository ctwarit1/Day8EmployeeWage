package com.bridgelabz;

	
//	Refactored Code in a Class Method to Compute Employee Wage - Used Class Method and Class
	
	
	
public class EmployeeWageWithOops {
	
//		instance variable	
		int IS_PART_TIME = 0;
		int IS_FULL_TIME =1;
		int TotalWage;
		
//		static variable
		static int EMP_RATE_PER_HOUR = 20;
		static int empHrs = 0;
		static int empWage = 0;
		static int totalWorkingDays=0;
		static int totalEmpHour=0;
		
//		static method
		public static void EmployeeWageWithOops() {
				  while(totalEmpHour <= 100 && totalWorkingDays <= 19) {
			            totalWorkingDays++;
				        double empCheck=Math.floor(Math.random()*10)%2;
				switch ((int) empCheck) {
				case 0:
					empHrs =4;
					break;
				case 1:
					empHrs = 8;
					break;
				default:
					empHrs=0;
				 }
				
				  }
		}
		public void DisplayingResult() {
			empWage=empHrs*EMP_RATE_PER_HOUR;
			totalEmpHour += empHrs;
			System.out.println("Days: "+totalWorkingDays);
			System.out.println("emp hours: "+empHrs);
		
			TotalWage=totalEmpHour*EMP_RATE_PER_HOUR;
			System.out.println("Total wage is: " + TotalWage);
		}
		public static void main(String[] args){
					EmployeeWageWithOops();
					EmployeeWageWithOops obj=new EmployeeWageWithOops();
					obj.DisplayingResult();
				}
}

