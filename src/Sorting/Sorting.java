package Sorting;

import java.util.Arrays;
public class Sorting {
    public static void main(String[] args) {
        final int[] array = {4, 2, 8, 6, 8, 7, 4, 12, 54, 2};
        Arrays.sort(array);
        print(array);
        print(sortAsc(array));
        print(sortDesc(array));
    }

    private static void print (int[] arr) {
        for (int index = 0; index < arr.length; index++) {
            System.out.print(arr[index] + " ");
        }
        System.out.println();
    }

    private static int[] sortAsc(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if(array[j] > array[j + 1]) {
                    switchElements(array, j);
                }
            }
        }
        return array;
    }
    private static int[] sortDesc(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if(array[j] < array[j + 1]) {
                    switchElements(array, j);
                }
            }
        }
        return array;
    }

    private static void switchElements(int[] array, int j) {
        int temp = array[j];
        array[j] = array[j + 1];
        array[j + 1] = temp;
    }

}
