package TASK2_GRADE_CALCULATOR;
import java.util.Scanner;

public class Student_Grade_Calculator {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Student Grade Calculator");
            System.out.print("Enter student's name: ");
            String studentName = scanner.nextLine();

            System.out.print("Enter the number of assignments: ");
            int numAssignments = scanner.nextInt();

            double totalScore = 0;
            for (int i = 1; i <= numAssignments; i++) {
                System.out.print("Enter score for Assignment " + i + ": ");
                double assignmentScore = scanner.nextDouble();
                totalScore += assignmentScore;
            }

            double averageScore = totalScore / numAssignments;

            String letterGrade = calculateLetterGrade(averageScore);

            System.out.println("Student Name: " + studentName);
            System.out.println("Average Score: " + averageScore);
            System.out.println("Letter Grade: " + letterGrade);

            scanner.close();
        }

        public static String calculateLetterGrade(double averageScore) {
            if (averageScore >= 90) {
                return "A";
            } else if (averageScore >= 80) {
                return "B";
            } else if (averageScore >= 70) {
                return "C";
            } else if (averageScore >= 60) {
                return "D";
            } else {
                return "F";
            }
        }
    }


