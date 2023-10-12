package Week1.Lab;

import java.util.Scanner;

public class Ex5 {

    public static void main(String[] arsg){


        System.out.print("Type a number: ");
        Scanner reader=new Scanner(System.in);
        int number=reader.nextInt();

        if(number>0){
            System.out.println("The number is positive.");
        }else{
            System.out.println("The number is negative.");
        }
    }


}
