import java.util.InputMismatchException;
import java.util.Scanner;

public class GradeCalculator{
    public static void main(String [] args){
        String studentName;
        int subjectE = 0;
        int subjectM = 0;
        int subjectS = 0;
        int subjectP = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Student Name: ");
        studentName = scanner.nextLine();

        while (subjectE <= 0 ) {
            if (subjectE <= 0) {
                System.out.print("Grade English Subject: ");
                try {
                    subjectE = scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input.");
                    scanner.nextLine();
                }
            }

        }
            while (subjectM <= 0 ) {
                if (subjectM <= 0) {
                    System.out.print("Grade Math Subject: ");
                    try{
                        subjectM = scanner.nextInt();
                    } catch(InputMismatchException e){
                        System.out.println("Invalid input.");
                        scanner.nextLine();
                    }

                }
            }
            while (subjectS <= 0 ) {
                if (subjectS <= 0) {
                System.out.print("Grade Science Subject: ");
                try {
                    subjectS = scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input.");
                    scanner.nextLine();
                }

                }
            }
            while (subjectP <= 0 ) {
                if (subjectP <= 0) {
                    System.out.print("Grade Programming Subject: ");
                try {
                    subjectP = scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input.");
                    scanner.nextLine();
                }
            }
        }
        int total = subjectE + subjectM + subjectS + subjectP;
        int average = total / 4;
        System.out.println("The average of the Student: " + average);
        }
    }



