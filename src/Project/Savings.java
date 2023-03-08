package Project;

public  class Savings extends Account{
	private double minbalance;

	public Savings(int accNumber, double balance, Customer customerobj, double minbalance) {
		super(accNumber, balance, customerobj);
		this.minbalance = minbalance;
	}

	public double getMinbalance() {
		return minbalance;
	}

	public void setMinbalance(double minbalance) {
		this.minbalance = minbalance;
	}
	@Override
	public boolean withdraw(double amount){
		if(balance-amount>minbalance) {
			balance-=amount;
			return true;
		}
		else
		{
			return false;
		}
			
	}
}
