package TwoDArray;
import java.util.*;
public class HotelFoodBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] food = new int[3][3];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 3; i++) {
			System.out.println("Enter food item price: ");
			for(int j = 0; j < 3; j++) {
				food[i][j] = sc.nextInt();
				
			}
		}
		for(int i = 0; i < 3; i++) {
			int sum = 0;
			for(int j = 0; j < 3; j++) {
				sum = sum + food[i][j];
				
			}
			System.out.println("Student "+(i+1)+ " Total: "+sum);
			
		}
	}

}
