package Week2.Lecture;

import java.util.Scanner;

public class TrueAge {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = reader.nextInt();

        while (true){
            if(age<3 || age>125){
                System.out.println("You are a little liar.");
                if(age<3){
                    System.out.println("You are too young to write and read.");
                }else {
                    System.out.println("Go die!");
                }
                System.out.print("Enter youre age agin. This time without lying: ");
                age=reader.nextInt();
                continue;
            }
            break;
            }
        System.out.println("You are " + age + " years old.");

        }

}



