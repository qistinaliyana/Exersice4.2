
public class Greengrapes extends grapes {
	double weight, price, total ;
	public Greengrapes(String name, String color, double weight, double price) {
	     super (name, color, price);
	     this.weight = weight;
	     this.price = price;
	     this.total = weight * price;
	}
}
