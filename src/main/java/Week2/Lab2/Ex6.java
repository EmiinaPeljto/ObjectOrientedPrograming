package Week2.Lab2;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        printText();
    }

    public static void printText() {
        Scanner reader = new Scanner(System.in);
        System.out.print("How many times do you want to print the text: ");
        int number = reader.nextInt();
        for (int i = 0; i < number; i++) {
            System.out.println("In the beginning there were the swamp, the hoe and Java. ");
        }
    }
}
