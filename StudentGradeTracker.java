import java.util.*;
public class StudentGradeTracker 
{
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number of students: ");
int n=sc.nextInt();
double[][] studentGrades = new double[n][5];
for(int i=0;i<n;i++) 
{
System.out.println("Enter grades for Student "+(i+1)+":");
for(int j=0;j<5;j++) 
{
System.out.print("Grade "+(j+1)+":");
studentGrades[i][j]=sc.nextDouble();
}
}
double totalSum=0;
double highestScore=Double.MIN_VALUE;
double lowestScore=Double.MAX_VALUE;
for(int i=0;i<n;i++) 
{
double studentSum=0;
for(int j=0;j<5;j++) 
{
studentSum+=studentGrades[i][j];
highestScore=Math.max(highestScore,studentGrades[i][j]);
lowestScore=Math.min(lowestScore,studentGrades[i][j]);       
}
totalSum+=studentSum;            
}
double averageScore=totalSum/(n*5);
System.out.println("\nStatistics:");
System.out.println("Average Score:"+averageScore);
System.out.println("Highest Score:"+highestScore);
System.out.println("Lowest Score:"+lowestScore);
sc.close();
}
}
