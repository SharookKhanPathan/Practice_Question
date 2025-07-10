package TwoDArray;
class Rectangle{
	double len = 7.8;
	double wid = 7.8;
}
class Area extends Rectangle{
	void print() {
		System.out.println("Area:"  + (len*wid));
	}
}
public class AreaOfRectangle  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Area a = new Area();
		 a.print();
	}

}
