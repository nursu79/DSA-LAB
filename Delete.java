package question6;

import java.util.Arrays;
import java.util.Scanner;
public class Delete {



    public static int[] deleteElement(int[] arr, int index) {
        if (index < 0 || index >= arr.length) {
            System.out.println("Invalid index.");
            return arr;
        }

        int[] UpdatedArray = new int[arr.length - 1];
        int currentIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i != index) {
                UpdatedArray[currentIndex] = arr[i];
                currentIndex++;
            }
        }

        return UpdatedArray;
    }

    public static void main(String[] args) {
        int[] array = {3, 7, 1, 9, 4};
        int index = 2;

        int[] modifiedArray = deleteElement(array, index);

        System.out.println("Original array: " + Arrays.toString(array));
        System.out.println("Modified array: " + Arrays.toString(modifiedArray));
    }
	



  
	

}
