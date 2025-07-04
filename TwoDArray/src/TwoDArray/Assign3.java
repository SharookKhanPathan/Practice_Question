package TwoDArray;

public class Assign3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] classroom = {
			    {101, 102, 103, 104, 105},
			    {106, 107, 108, 109, 110},
			    {111, 112, 113, 114, 115},
			    {116, 117, 118, 119, 120}
			};
		int sum = 0;
		int max = 0;
		for(int i = 0; i < 4; i++) {
			//int rowsum = 0;
			for(int j = 0; j < 5; j++) {
				System.out.print(classroom[i][j]+"\t");
				sum = sum + classroom[i][j];
				//rowsum = romsum + classroom[i][j];
				if(classroom[i][j] > max)
					max = classroom[i][j];
			}
			System.out.println();
		}
		System.out.println("Sum of all IDs: "+sum);
		System.out.println("Max ID: "+max);
		for(int i = 0; i < 4; i++) {
			int rowsum = 0;
			for(int j = 0; j < 5; j++) {
				rowsum = rowsum + classroom[i][j];
			}
			System.out.println("Sum of IDs: "+rowsum);
		}

	}

}
