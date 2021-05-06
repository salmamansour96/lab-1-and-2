package helloworld;

public class Test {
	
	private int  age;
	private float salary;
	public Test (int age,float salary) {
		this.age=age;
		this.setSalary(salary);
		
		
	}
	
	public int getage() {
		
		return age;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	

}
