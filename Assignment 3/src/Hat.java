
public class Hat extends Product{
	
	// attributes
	private String color;
	private double price;
	private boolean adjustable;
	
	// constructors
	public Hat() {
		color = "";
		price = 0.0;
		adjustable = false;
	}
		
	public Hat(String color, double price, boolean adjustable) {
		this.color = color;
		this.price = price;
		this.adjustable = adjustable;
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

	
	public boolean getAdjustable() {
		return adjustable;
	}

	public void setAdjustable(boolean adjustable) {
		this.adjustable = adjustable;
	}
	
	public String outputProduct() {
		String str = "";
	    str += "Hat, " + color;
	    str += ", $" + price;
	    
	    if (adjustable == true) {
	    	str += ", is adjustable";
	    } else {
	    	str += ", is not adjustable";
	    }
	    
		return str;
	}
	
	
	
}
