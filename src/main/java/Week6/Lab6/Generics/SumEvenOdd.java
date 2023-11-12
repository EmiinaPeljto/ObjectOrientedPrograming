package Week6.Lab6.Generics;

import java.util.List;

public class SumEvenOdd {
    public static <T extends Number> void calculateSum(List<T> numbers) {
        double sumOfEven = 0;
        double sumOfOdd = 0;

        for (T number : numbers) {
            if (number.doubleValue() % 2 == 0) {
                sumOfEven += number.doubleValue();
            } else {
                sumOfOdd += number.doubleValue();
            }
        }

        System.out.println("Original list of numbers: " + numbers);
        System.out.println("Sum of even numbers: " + sumOfEven);
        System.out.println("Sum of odd numbers: " + sumOfOdd);
    }
}