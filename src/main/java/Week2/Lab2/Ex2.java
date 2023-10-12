package Week2.Lab2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {


        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int read;

        for (int i=0;i<3;i++){

            System.out.print("Type numbers: ");
            read=reader.nextInt();
            sum+=read;

        }
        System.out.println("Sum: " + sum);
    }

}
