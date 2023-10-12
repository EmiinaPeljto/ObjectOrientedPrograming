package Week2.Lab2;

import java.util.Random;
import java.util.Scanner;

public class Ex10 {

    public static int drawNumber(){

        return new Random().nextInt(100);
    }

    public static void main(String[] args) {
        int rightNumber=(int)drawNumber();
        Scanner reader=new Scanner(System.in);
        int gusses=1;

        while(true) {
            System.out.print("Guss a number: ");
            int number=reader.nextInt();
            if (rightNumber < number) {
                System.out.println("The number is lesser, gusses made: "+ gusses);
            } else if (rightNumber > number) {
                System.out.println("The number is greater, gusses made: " + gusses);
            } else {
                System.out.println("Congratulations, your guess is correct!" );
                break;
            }
            gusses++;
        }

    }
}
