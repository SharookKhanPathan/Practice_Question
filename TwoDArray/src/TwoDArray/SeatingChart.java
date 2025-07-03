package TwoDArray;

public class SeatingChart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[3][4];
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 4; j++) {
				if(i == 1 && j == 2)
					arr[i][j] = 1;
				else
					arr[i][j] = 0;
				
			}
			
		}
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
			
		}
		
	}

}
