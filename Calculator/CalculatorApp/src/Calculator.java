//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        int first_number = 0;
        int second_number = 0;
        int sum = 0;
        int multi = 0;
        int minus = 0;
        int div = 0;
        char operator;
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("1st Number: ");
            first_number = scanner.nextInt();
            if (first_number != 0){
                System.out.println("Operators: *, +, /, -");
                System.out.print("Select your Operator: ");
                operator = scanner.next().charAt(0);
                if (operator == '+'){
                    System.out.print("2nd Number: ");
                    second_number = scanner.nextInt();
                    sum = first_number + second_number;
                    System.out.println("The Answer for "+ first_number + " + "+ second_number + " = " + sum);
                }
                else if (operator == '*'){
                    System.out.print("2nd Number: ");
                    second_number = scanner.nextInt();
                    multi = first_number * second_number;
                    System.out.println("The Answer for "+ first_number + " * "+ second_number + " = " + multi);
                }
                else if (operator == '/'){
                    System.out.print("2nd Number: ");
                    second_number = scanner.nextInt();
                    div = first_number / second_number;
                    System.out.println("The Answer for "+ first_number + " / "+ second_number + " = " + div);
                }
                else if (operator == '-') {
                    System.out.print("2nd Number: ");
                    second_number = scanner.nextInt();
                    minus = first_number - second_number;
                    System.out.println("The Answer for " + first_number + " - " + second_number + " = " + minus);
                }
            } else {
                System.out.println("Try again!");
            }
        }


    }
}