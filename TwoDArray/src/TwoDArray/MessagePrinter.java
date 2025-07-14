package TwoDArray;

public class MessagePrinter {
	void print(String s) {
		System.out.println(s);
	}
	void print(String s, int count) {
		for(int i = 0; i < count; i++) {
			System.out.println(s);
		}
	}
	void print(char c, int count) {
		for(int i = 0; i < count; i++) {
			System.out.println(c);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MessagePrinter m = new MessagePrinter();
		m.print("Sharook Khan");
		System.out.println("=================");
		m.print("sharook khan",5);
		System.out.println("=================");
		m.print("#",5);
	}

}
