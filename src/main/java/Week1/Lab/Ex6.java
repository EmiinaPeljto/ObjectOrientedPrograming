package Week1.Lab;

import java.util.Scanner;

public class Ex6 {

    public static void main(String[] arsg){

        System.out.print("Type the first number: ");
        Scanner reader=new Scanner(System.in);
        int number1=reader.nextInt();

        System.out.print("Type the second number: ");
        int number2=reader.nextInt();

        if(number1>number2){
            System.out.println("Greater number: " + number1);
        }else if(number2>number1){
            System.out.println("Greater number: " + number2);
        }else{
            System.out.println("The numbers are equal!");
        }
    }

}
