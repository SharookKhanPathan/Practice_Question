package TwoDArray;

public class StudentMarkTracker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s1,s2,s3,s4;
		int[][] marks = {{24,13,34},{24,56,76},{23,34,67},{24,76,23}};
		for(int i = 0; i < 4; i++) {
			int sum = 0;
			for(int j = 0; j < 3; j++) {
				sum = sum + marks[i][j];
				
			}
			System.out.println("Student "+(i+1)+ " Total: "+sum);
			
		}
	}

}
