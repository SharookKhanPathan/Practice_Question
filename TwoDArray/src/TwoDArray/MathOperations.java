package TwoDArray;
class Operations{
	
	void multiply(int a,int b) {
		System.out.println("Multiply two Integer Values: "+ (a * b));
	}
	void multiply(int a,int b, int c) {
		System.out.println("Multiply 3 Integer Values: "+ (a * b * c));
	}
	void multiply(double a,double b) {
		System.out.println("Multiply Double Values: "+ (a * b));
	}
}
public class MathOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Operations o = new Operations();
		o.multiply(2,3);
		o.multiply(7.5, 39.0);
		o.multiply(3, 4, 9);
		
		
	}

}
