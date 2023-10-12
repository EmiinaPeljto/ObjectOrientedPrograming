package Week1.Lecture;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        while (true) {

            List<String> choices = Arrays.asList("sum", "difference", "quit");
            System.out.print("Do you want to sum,difference or quit: ");
            String userChoice=reader.nextLine();

            if(choices.contains(userChoice)){

                if(userChoice.equals("quit")){
                    System.out.println("We're sorry to see you go");
                    break;
                }

                System.out.println("Enter first number: ");
                int firstNumber=reader.nextInt();
                System.out.println("Enter second number: ");
                int secondNumber=reader.nextInt();

                if(userChoice.equals("sum")){
                    System.out.println("The result is " + (firstNumber+secondNumber));
                    break;
                }
                System.out.println("The result is " + (firstNumber-secondNumber));
                break;

            }
        }
    }

}
