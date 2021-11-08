
public class Bottle extends Product {
	
	// attributes
	private String color;
	private double price;
	private char size;
	
	// constructors
	public Bottle() {
		color = "";
		price = 0;
		size = '\u0000';
	}
			
	public Bottle(String color, double price, char size) {
		this.color = color;
		this.price = price;
		this.size = size;
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

		
	public char getSize() {
		return size;
	}

	public void setSize(char size) {
		this.size = size;
	}
	
	
	// output method
	public String outputProduct() {
		String str = "";
	    str += "Bottle, " + color;
	    str += ", $" + price;
		    
		if (size == 'L') {
	    	str += ", large";
	    } else {
	    	str += ", small";
		}
		    
		return str;
	}
}
