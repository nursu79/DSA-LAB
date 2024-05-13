package question4;

import java.util.Arrays;

public class AlphabetSort {

	public static void bubbleSort(char[] arr) {
        int size = arr.length;

        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    char store = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = store;
                }
            }
        }
    }

    public static void main(String[] args) {
        char[] alphabets = {'c', 'g', 'a', 'i', 'd'};

        System.out.println("Original array: " + Arrays.toString(alphabets));

        bubbleSort(alphabets);

        System.out.println("Sorted array: " + Arrays.toString(alphabets));
    }
	

}
