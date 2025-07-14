package TwoDArray;
import java.util.*;
public class Palinrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int res = 0;
		while(num > 0) {
			int digit = num % 10;
			res = res * 10 + digit;
			num = num / 10;
		}
		System.out.println(res);
	}

}
