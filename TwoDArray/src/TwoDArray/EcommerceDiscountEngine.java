package TwoDArray;

class Product{
	double price;
	Product(double price) {
		this.price = price;
	}
	void applydiscount() {
		System.out.println("Discount Not Applied");
		
	}
}
class Electronics extends Product{
	Electronics(double price){
		super(price);
	}
	void applydiscount() {
		System.out.println("Electrins Price: "+price * 0.8);
		
	}
}
class Clothing extends Product{
	Clothing(double price){
		super(price);
	}
	void  applydiscount() {
		System.out.println("Clothing Price: "+price * 0.7);
		 
	}
}
class Books extends Product{
	Books(double price){
		super(price);
	}
	void  applydiscount() {
		System.out.println("Books Price: "+price * 0.7);
		 
	}
}

public class EcommerceDiscountEngine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product[] products = {new Electronics(500),new Clothing(500),new Books(500)};
		for(Product a : products) {
			a.applydiscount();
		}

	}

}
