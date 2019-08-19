package firstPackage;

public class CarDetails {
	
	public static void main(String[] args) {
		
		CarModels q7 = new CarModels();
		CarModels qx60 = new CarModels();
		CarModels mdx = new CarModels();
		
		q7.make = "Audi";
		q7.model = "Q7";
		q7.km = 123555;
		q7.accident = true;
		q7.year = 2011;
		q7.testEligibilityForCPO();
		
		qx60.make = "Infinity";
		qx60.model = "QX60";
		qx60.km = 78000;
		qx60.accident = false;
		qx60.year = 2015;
		qx60.testEligibilityForCPO();
		
		mdx.make = "Acura";
		mdx.model = "MDX";
		mdx.km = 7000;
		mdx.accident = true;
		mdx.year = 2019;
		mdx.testEligibilityForCPO();
		
		System.out.println("Is Q7 eligible for CPO? " + q7.eligibleForCPO);
		System.out.println("Is QX60 eligible for CPO? " + qx60.eligibleForCPO);
		System.out.println("Is MDX eligible for CPO? " + mdx.eligibleForCPO);
		
		
		
	}

}
