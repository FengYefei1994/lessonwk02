package Interface1;

public abstract class Phone {
	
	private String brand;
	private String type;
	
	public void phone() {
		
	}
	public void phone(String brand,String type) {
		this.brand=brand;
		this.type=type;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand() {
		this.brand=brand;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType() {
		this.type=type;
	}
	
	public abstract void message();
	
	public abstract void phoneCall(); 
	
	public  void showIn(String brand,String type) {
		System.out.println("这是一台"+brand+type+"手机");
	}
}
