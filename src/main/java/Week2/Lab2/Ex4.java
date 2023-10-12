package Week2.Lab2;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

        Scanner reader=new Scanner(System.in);
        System.out.print("First: ");
        int firstNumber=reader.nextInt();
        System.out.print("Second: ");
        int secondNumber=reader.nextInt();

        for (int i=firstNumber;i<=secondNumber;i++) {
            if(firstNumber>secondNumber){
                break;
            }
            System.out.println(i);
        }
    }
}
