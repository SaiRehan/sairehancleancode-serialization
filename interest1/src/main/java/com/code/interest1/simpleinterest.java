package com.code.interest1;

public class simpleinterest {
	double Amount,Noofyears,rate;

	public simpleinterest(double Amount, double Noofyears, double rate) {
		// TODO Auto-generated constructor stub
		this.Amount=Amount;
		this.Noofyears=Noofyears;
		this.rate=rate;
	}

	public double calculate() {
		// TODO Auto-generated method stub
		return (Amount *Noofyears * rate)/100;
	}
	

}
