package javaExamples;

import java.lang.reflect.Array;

public class ArrayExamples {

    /**
     * Sum the values
     * @param
     */

    public static int sumValues(int[] my_array){
        int sum = 0;

        for (int i : my_array)
            sum += i;

        return sum;
    }

    public static boolean containsNr(int[] arr, int item){
        for (int n : arr) {
            if (item == n) return true;
        }
        return false;
    }

    public static int findIndex(int[] arr, int item){
        if (arr == null) return -1;
        int len = arr.length;
        int i = 0;

        while (i < len){
            if (arr[i] == item) return i;
            else i++;
        }
        return -1;
    }


    public static void main(String[] args) {
        int testArray[] =  {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("Sum of the ints in array: " + sumValues(testArray));
        System.out.println("Contains number: " + containsNr(testArray, 10));
        System.out.println("The index is: " + findIndex(testArray, 2));




    }

}
