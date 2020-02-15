package interest;

public class compoundinterest {
	double Amount,Noofyears,rate;

	public compoundinterest(double Amount, double Noofyears, double rate) {
		// TODO Auto-generated constructor stub
		this.Amount=Amount;
		this.Noofyears=Noofyears;
		this.rate=rate;
	}

	public double calculate() {
		// TODO Auto-generated method stub
		return Amount * Math.pow(1.0+rate/100.0,Noofyears) - Amount;
	}

}
