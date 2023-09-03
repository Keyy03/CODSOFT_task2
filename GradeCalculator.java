package CODSOFT2;
import java.util.Scanner;
public class GradeCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter the number of subjects:");
		int numsubjects =scanner.nextInt();
		int totalmarks=0;
		for(int i=1;i<=numsubjects;i++)
		{
			System.out.print("Enter the marks obtained in subject"+i+"(out of 100):");
			int marks =scanner.nextInt();
			
			if(marks<0|| marks>100)
			{
				System.out.print("Invalid Inputs!!!");
				i--;
			}else {
				totalmarks += marks;
			}
		}
		double averagePercentage =(double)totalmarks/numsubjects;
		String grade;
		if(averagePercentage >= 90) {grade="A";}
		else if (averagePercentage >= 80) {grade="B";}
		else if (averagePercentage >= 70) {grade="C";}
		else if (averagePercentage >= 60) {grade="D";}
		else if (averagePercentage >= 50) {grade="E";}
		else {grade="F";}
		System.out.println("total Marks="+totalmarks);
		System.out.println("Average Percentage="+averagePercentage);
		System.out.println("Grade="+grade);
		scanner.close();
	}

}
