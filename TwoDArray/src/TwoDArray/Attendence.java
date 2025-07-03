package TwoDArray;
import java.util.*;

public class Attendence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[][] attend = new int[5][3];
		for(int i = 0; i < 3; i++) {
			System.out.println("Enter Day "+(i+1)+" attendence: ");
			for(int j = 0; j < 5; j++) {
				attend[j][i] = sc.nextInt();
			}
		}
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 3; j++) {
				System.out.print(attend[i][j]+" ");
			}
			System.out.println();
		}
	}

}
