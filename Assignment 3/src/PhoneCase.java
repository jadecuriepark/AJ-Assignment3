public class PhoneCase extends Product {
	
	// attributes
	private String color;
	private double price;
	private String model;
	
	// constructors
	public PhoneCase() {
		color = "";
		price = 0;
		model = "";
	}
			
	public PhoneCase(String color, double price, String model) {
		this.color = color;
		this.price = price;
		this.model = model;
	}
		
	// getter and setter methods
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
		

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

		
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	
	// output method
	public String outputProduct() {
		String str = "";
	    str += "Phone case, " + color;
	    str += ", $" + price;
	    str += ", fits iPhone " + model;
		    
		return str;
	}
}