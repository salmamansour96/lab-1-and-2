package helloworld;

public class Order {
	private  OrderHeader he;
	private OrderLine  l;
	public Order(OrderHeader h,OrderLine l) {
		
		he=h;
		this.l=l;
	}

	private Customer oredredby;

	public Customer getOredredby() {
		return oredredby;
	}

	public void setOredredby(Customer oredredby) {
		this.oredredby = oredredby;
	}
	
	
	public void Contains() {
		
		
		System.out.println(l.getNoUints());
	}
	
	
	public void Definedby()
	{
		
		
		System.out.println(he.getOrderDate());
	}
}
