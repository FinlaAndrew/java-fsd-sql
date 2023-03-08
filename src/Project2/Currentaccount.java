package Project2;

public class Currentaccount extends Account implements MaintainenceCharge {

	public Currentaccount(String accname, String cusname, double balance) {
		super(accname, cusname, balance);
		// TODO Auto-generated constructor stub
		
	}
	float m=100;
	@Override

	public float calculateMaintenanceCharge(float noOfYears) {
		float n=noOfYears;
		float charge;
		charge=((m*n)+200);
		return charge;
	}
	
}
