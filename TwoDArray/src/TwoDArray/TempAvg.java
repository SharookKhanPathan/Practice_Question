package TwoDArray;
import java.util.Scanner;
public class TempAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float[][] temp = new float[2][7];
		for(int i = 0; i < 2; i++) {
			System.out.print("Enter "+(i+1)+" city temperatures: ");
			for(int j = 0; j < 7; j++) {
				temp[i][j] = sc.nextFloat();
			}
			
		}
		for(int i = 0; i < 2; i++) {
			System.out.print((i+1)+" city avg temperature: ");
			float sum = 0;
			for(int j = 0; j < 7; j++) {
				sum = sum + temp[i][j];
			}
			float avg = sum/7;
			System.out.println(avg);
			
		}
	}

}
