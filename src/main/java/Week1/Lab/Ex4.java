package Week1.Lab;

import java.util.Scanner;

public class Ex4 {

    public static void main(String[] args){

        System.out.print("Type a number: ");
        Scanner reader=new Scanner(System.in);
        int number1=reader.nextInt();

        System.out.print("Type another number: ");
        int number2=reader.nextInt();

        int sum=0;
        sum=number1+number2;

        System.out.print("Sume of the numbers: " + sum);
    }
}
