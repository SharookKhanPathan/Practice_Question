package TwoDArray;

class Employee{
//	int salary;
//	Employee(int salary){
//		this.salary = salary;
//	}
	void calculateSalary() {
		
	}
}
class FullTimeEmployee extends Employee{
//	FullTimeEmployee(int salary){
//		super(salary);
//	}
	void calculateSalary() {
		System.out.println("FullTimeEmployee Salary: 50,000/-");
	}
	
}
class PartTimeEmployee extends Employee{
//	PartTimeEmployee(int salary){
//		super(salary);
//	}
	void calculateSalary() {
		System.out.println("PartTimeEmployee Salary: 40,000/-");
	}
	
}
class ContractEmployee extends Employee{
//	ContractEmployee(int salary){
//		super(salary);
//	}
	void calculateSalary() {
		System.out.println("ContractEmployee Salary: 75,000/-");
	}
	
}
public class EmployeePayrollSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e;
		e = new FullTimeEmployee();
		e.calculateSalary();
		e = new PartTimeEmployee();
		e.calculateSalary();
		e = new ContractEmployee();
		e.calculateSalary();
		
		
	}

}
