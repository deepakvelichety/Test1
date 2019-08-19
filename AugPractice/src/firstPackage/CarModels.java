package firstPackage;

public class CarModels {
	
	String make;
	String model;
	int year;
	float km;
	boolean accident;
	boolean eligibleForCPO;
	
	public void testEligibilityForCPO(){
		if (year >= 2014 & km < 100000 & !accident) {
			eligibleForCPO=true;
		}
	}

}
