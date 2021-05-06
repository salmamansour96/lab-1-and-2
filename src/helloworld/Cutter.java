package helloworld;

public class Cutter {
    private String ip;
	public Cutter(String ip)
	{
		this.ip=ip;
		
		
	}
	
	public String get_ip() {
		
		return ip;
	}
	public int[] cut(){
		
		String[] ips=ip.split("\\.");
		
		int [] ip_num;
		ip_num=new int[ips.length];
		
		for(int i=0;i<ips.length;i++) {
			
			ip_num[i]=Integer.parseInt(ips[i]);
			
			
		}
		
		
		return ip_num;
	}
}
