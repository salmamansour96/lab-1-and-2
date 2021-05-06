package helloworld;

public class Merchant extends Customer {
	public Merchant(String name) {
		
		super(name);
	}
	private  float totlepurachse;

	public float getTotlepurachse() {
		return totlepurachse;
	}

	public void setTotlepurachse(float totlepurachse) {
		this.totlepurachse = totlepurachse;
	}
	
	
	public float calculate() {
		
		return totlepurachse*250;
	}
	
	
	
	

}
