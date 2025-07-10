package TwoDArray;
class StudentDetails{
	String name;
	String rollNo;
	StudentDetails(String name,String rollNo){
		this.name = name;
		this.rollNo = rollNo;
	}
}
class LibraryDetail extends StudentDetails{
	String Bookname;
	LibraryDetail(String name,String rollNo,String Bookname){
		//this.Bookname = Bookname;
		super(name,rollNo);
		this.Bookname = Bookname;
	}
	void print() {
		System.out.println("Name: "+name);
		System.out.println("RollNo: "+rollNo);
		System.out.println("Bookname: "+Bookname);
	}
}
public class LibraryRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LibraryDetail l = new LibraryDetail("Sharook","21BQ1A05J0","30Days");
		l.print();
	}

}
