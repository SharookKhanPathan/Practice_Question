package TwoDArray;
import java.util.*;
public class TicTacToe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] table = new char[3][3];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				table[i][j] = sc.next().charAt(0);
			}
		}
	}

}
