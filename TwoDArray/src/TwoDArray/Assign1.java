package TwoDArray;
import java.util.*;
public class Assign1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("Enter Number of Students: ");
		n = sc.nextInt();
		int max = 0;
		int i = 1;
		int min = 110;
		int CountA = 0,CountB = 0,CountC = 0,CountD = 0,CountF = 0;
		while(i<=n) {
			System.out.println("Enter "+(i)+" Student Marks:");
			int mark = sc.nextInt();
			if(!(mark >= 0 && mark <=100) ) {
				System.out.println("Invalid Marks");
				continue;
			}
			if(mark >= 90 && mark <= 100) {
				System.out.println("Student "+(i)+" Grade: A");
				CountA++;
			}
			if(mark >= 80 && mark < 90) {
				System.out.println("Student "+(i)+" Grade: B");
				CountB++;
			}
			if(mark >= 70 && mark < 80) {
				System.out.println("Student "+(i)+" Grade: C");
				CountC++;
			}
			if(mark >= 60 && mark < 70) {
				System.out.println("Student "+(i)+" Grade: D");
				CountD++;
			}
			if(mark > 0 && mark < 60) {
				System.out.println("Student "+(i)+" Grade: E");
				CountF++;
			}
			if(max < mark) {
				max = mark;
			}
			if( min > mark) {
				min = mark;
			}
			
			i++;
			
		}
		System.out.println("Total Number of Students: "+n);
		System.out.println("A Grade Count: "+CountA);
		System.out.println("B Grade Count: "+CountB);
		System.out.println("C Grade Count: "+CountC);
		System.out.println("D Grade Count: "+CountD);
		System.out.println("F Grade Count: "+CountF);
		System.out.println("Max Mark: "+max);
		System.out.println("Min Mark: "+min);
	}

}
