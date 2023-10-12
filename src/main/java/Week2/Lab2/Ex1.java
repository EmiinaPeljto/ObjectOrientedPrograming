package Week2.Lab2;

import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        String correctPassword="carrot";
        Scanner reader= new Scanner(System.in);


        while(true){

            System.out.print("Type the password: ");
            String password=reader.next();

            if(password.equals(correctPassword)){
                System.out.println("Right!");
                System.out.println();
                System.out.println("The secret is: jryy qbar!");
                break;
            }else{
                System.out.println("Wrong!");
            }
        }
    }

}
