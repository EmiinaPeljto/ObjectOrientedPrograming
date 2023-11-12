package Week6.Lab6.Exercise;

import Week6.Lab6.Exercise.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

class exercises {
    public static void main(String[] args) {

        int[] array = {6, 5, 8, 7, 11};
        int[] array2 = {3, 2, 5, 4, 8};
        int[] array4={5,1,3,4,2};
        int[] arrray={-1,6,9,8,12};

        System.out.println(indexOfTheSmallestStartingForm(arrray,1));

        System.out.println("smallest: " + smallest(array));
        System.out.println("Index of the smallest: " + indexOfTheSmallest(array));
        System.out.println(Arrays.toString(array2));
        swap(array2, 1, 0);
        System.out.println(Arrays.toString(array2));

        int[] array3 = {-3, 2, 3, 4, 7, 8, 12};
        Scanner reader = new Scanner(System.in);
        System.out.println("Value of the array: " + Arrays.toString(array3));
        System.out.println();

        System.out.println("Enter searched number: ");
        String sv = reader.nextLine();
        System.out.println();

        boolean result = BinarySearch.search(array3, Integer.parseInt(sv));

        if (result) {
            System.out.println("Value " + sv + " is in the array");
        } else {
            System.out.println("Value " + sv + " is not in the array");
        }

        printElegntly(array4);
        System.out.println(indexOfTheSmallestStartingForm(arrray,1));



    }

    public static int smallest(int[] array) {
        int min = array[0];
        for (int t : array) {
            if (t < min) {
                min = t;
            }
        }
        return min;
    }

    public static int indexOfTheSmallest(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = i;
            }
        }
        return min;
    }

    public static int indexOfTheSmallestStartingForm(int[] array, int index) {
        int min=array[index];
        int in=index;
        for(int i=index;i<array.length;i++){
            if(array[i]<min){
                min=array[i];
                in=i;
            }
        }
        return in;
    }

    public static void swap(int[] array2, int index1, int index2) {

        int temp = array2[index1];
        array2[index1] = array2[index2];
        array2[index2] = temp;

    }

    public static void printElegntly(int[] array4){

        for(int i=0;i<array4.length;i++){
            if(i<array4.length-1){
            System.out.print(array4[i]+", ");
            }else System.out.println(array4[i]);
        }
    }
}

