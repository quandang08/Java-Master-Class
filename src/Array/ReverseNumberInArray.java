package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseNumberInArray {
    public static void main(String[] args) {
        int[] returnedArrays = readIntegers();
        System.out.println(Arrays.toString(returnedArrays));
//        int returnedMin = findMin(returnedArrays);
//        System.out.println(returnedMin);
        reverse(returnedArrays);
        System.out.println("Final: " + Arrays.toString(returnedArrays));
    }

    private static int[] readIntegers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a list of integers, separated by commas:");
        String input = scanner.nextLine();

        String[] splits = input.split(",");
        int[] values = new int[splits.length];
        for (int i = 0; i < splits.length; i++) {
            values[i] = Integer.parseInt(splits[i].trim());
        }
        return values;
    }

    public static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    private static void reverse(int[] array) {
        int halfLength = array.length / 2;

        for (int i = 0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i]; // swap với phần tử đối xứng
            array[array.length - 1 - i] = temp;
            System.out.println("--->" + Arrays.toString(array));
        }
    }

    private static int[] reverseCopy(int[] array) {
        int[] reversedArray = new int[array.length];
        int maxIndex = array.length - 1;
        for (int el : array) {
            reversedArray[maxIndex--] = el;
        }
        return reversedArray;
    }
}

