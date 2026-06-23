import java.util.Scanner;

public class IT26101201Lab9Q4 { 

    
    public static double calcFinalMark(double assignmentMark, double examMark) {
        return (assignmentMark * 0.3) + (examMark * 0.7);
    }

    
    public static String findGrades(double mark) {
        if (mark >= 75) {
            return "A";
        } else if (mark >= 60) {
            return "B";
        } else if (mark >= 50) {
            return "C";
        } else {
            return "F";
        }
    }

    
    public static void printDetails(String name, double finalMark, String grade) {
       
        System.out.printf("%-16s%-16.2f%-16s\n", name, finalMark, grade);
    }

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        String[] names = new String[5];
        double[] finalMarks = new double[5];
        String[] grades = new String[5];

      
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Name of Student " + (i + 1) + ": ");
            names[i] = scanner.next();

            System.out.print("Enter Assignment Mark (out of 100) for " + names[i] + ": ");
            double assignment = scanner.nextDouble();

            System.out.print("Enter Exam Paper Mark (out of 100) for " + names[i] + ": ");
            double exam = scanner.nextDouble();
            
            System.out.println(); 

            
            finalMarks[i] = calcFinalMark(assignment, exam);
            grades[i] = findGrades(finalMarks[i]);
        }

        
        System.out.printf("%-16s%-16s%-16s\n", "Name", "Final Mark", "Grade");

        for (int i = 0; i < 5; i++) {
            printDetails(names[i], finalMarks[i], grades[i]);
        }

        scanner.close();
    }
}