package Week2.Lab2;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {

        Scanner reader=new Scanner(System.in);
        System.out.print("Type a number: ");
        int number=reader.nextInt();
        int result=0;

        for(int i=0; i<=number; i++){

            result=result+(int)Math.pow(2,i);

        }
        System.out.println("The result is: " + result);
    }
}
