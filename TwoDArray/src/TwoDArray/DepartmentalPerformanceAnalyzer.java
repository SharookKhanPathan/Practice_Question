package TwoDArray;

import java.util.Arrays;
import java.util.Scanner;

public class DepartmentalPerformanceAnalyzer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter Number of Departments: ");
		Scanner sc = new Scanner(System.in);
		int deptsNo = sc.nextInt();
		for(int i = 0; i < deptsNo; i++) {
			System.out.print("Enter Number of students in "+(i+1)+" Dept: ");
			int studentsNo = sc.nextInt();
			int s = studentsNo;
			String[] names = new String[studentsNo];
			System.out.print("Enter number of subjects: ");
			int subjectsNo = sc.nextInt();
			float f = subjectsNo;
			int[][] marks = new int[studentsNo][subjectsNo];
			for(int j = 0; j < studentsNo; j++) {
				System.out.print("Enter "+(j+1)+" Student Name:");
				names[j] = sc.next();
				for(int k = 0; k < subjectsNo; k++) {
					System.out.println("Enter "+names[j]+" Marks in "+(k+1)+" Subject: ");
					marks[j][k] = sc.nextInt();
				}
			}
			float totavg = 0;
			int passCount = 0;
			System.out.println("Department "+(i+1)+" Student Details");
			System.out.println("-------------------------------------");
			for(int j = 0; j < studentsNo; j++) {
				int sum = 0;
				//int passCount = 0;
				boolean status = true;
				System.out.println("Student Name: "+names[j]);
				for(int k = 0; k < subjectsNo; k++) {
					sum = sum + marks[j][k];
					if(marks[i][j] <= 35) status = false;
				}
				System.out.println("Total Marks: "+sum);
				float avg = sum/f;
				totavg = totavg + avg;
				System.out.println("Avg Marks: "+avg);
				if(status) {
					System.out.println("Status: Pass");
					passCount++;
					if(avg >= 90) {
						System.out.println("Grade: A");
					}
					else if(avg >= 75) {
						System.out.println("Grade: B");
					}
					else if(avg >= 60) {
						System.out.println("Grade: C");
					}
					else if(avg >= 35) {
						System.out.println("Grade: D");
					}
				}
				else {
					System.out.println("Status: Fail");
				}
				System.out.println("--------------------");	
			}
			float passPercentage = (passCount/s) * 100;
			System.out.println("--------------------");
			System.out.println("Department Details");
			System.out.println("Total Average: "+totavg/s);
			System.out.println("Pass Percentage: "+passPercentage+"%");
			
		}
	}

}
