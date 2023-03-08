package Project2;

public class Savingsaccount extends Account implements MaintainenceCharge {

	public Savingsaccount(String accname, String cusname, double balance) {
		super(accname, cusname, balance);
		// TODO Auto-generated constructor stub
	}
	float m=50;
	@Override
	public float calculateMaintenanceCharge(float noOfYears) {
		float n=noOfYears;
		float charge;
		charge=((m*n)+50);
		return charge;
	}

}
