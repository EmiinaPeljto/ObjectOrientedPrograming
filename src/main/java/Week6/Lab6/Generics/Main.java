package Week6.Lab6.Generics;

import java.util.List;

import static Week6.Lab6.Generics.ReverseOrderOfList.reverseList;
import static Week6.Lab6.Generics.SumEvenOdd.calculateSum;

public class Main {
    public static void main(String[] args) {
        List< Integer > listOfIntegers = List.of(1, 2, 3, 4, 5, 6, 7);
        List< Double > listOfDoubles = List.of(2.0, 1.5, 4.5, 2.5, 1.5);

        calculateSum(listOfIntegers);
        calculateSum(listOfDoubles);

        List < Integer > numbers = List.of(1, 2, 3, 4, 5, 6);
        List < String > colors = List.of("Red", "Green", "Orange");

        List < Integer > reversedNumbers = reverseList(numbers);
        List < String > reversedColors = reverseList(colors);

        System.out.println("Original list of numbers: " + numbers);
        System.out.println("Reversed list of numbers: " + reversedNumbers);
        System.out.println();
        System.out.println("Original list of colors: " + colors);
        System.out.println("Reversed list of colors: " + reversedColors);
    }
}
