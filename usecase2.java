public class usecase2 {

     public static void main(String[] args) {
	System.out.println("Welcome to employee wage computation Problem..");

	int IsFullTime=1;
	int empRatePerHrs=20;
	int empHrs=0;
	int empwage=0;

	double empcheck=Math.floor(Math.random() * 10)%2;
	if ( empcheck == IsFullTime)
		empHrs=8;
	else
		empHrs=0;

		empwage=empHrs*empRatePerHrs;
		System.out.println("Employee Wage= "+empwage);
	}
}