package question5;
import java.util.Arrays;
import java.util.Scanner;
public class MergeSOrt1 {


    public static int[] mergeSort(int[] array) {
        if (array.length <= 1) {
            return array;
        }

        int mid = array.length / 2;
        int[] left = Arrays.copyOfRange(array, 0, mid);
        int[] right = Arrays.copyOfRange(array, mid, array.length);

        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left, right);
    }

    public static int[] merge(int[] left, int[] right) {
        int[] merged = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                merged[k++] = left[i++];
            } else {
                merged[k++] = right[j++];
            }
        }

        while (i < left.length) {
            merged[k++] = left[i++];
        }

        while (j < right.length) {
            merged[k++] = right[j++];
        }

        return merged;
    }

    public static int countOccurrences(int[] array, int target) {
        int count = 0;

        for (int number : array) {
            if (number == target) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the sequence of numbers from the user
        System.out.print("Enter a sequence of numbers (space-separated): ");
        String sequence = scanner.nextLine();
        String[] numbers = sequence.split(" ");

        // Convert the numbers to an array of integers
        int[] array = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            array[i] = Integer.parseInt(numbers[i]);
        }

        // Sort the array using Merge Sort
        array = mergeSort(array);

        // Get the number to be searched
        System.out.print("Enter a number to be searched: ");
        int targetNumber = scanner.nextInt();

        // Count the occurrences of the target number in the array
        int occurrences = countOccurrences(array, targetNumber);

        // Display the result
        if (occurrences > 0) {
            System.out.printf("The number %d appears %d time(s) in the array.\n", targetNumber, occurrences);
        } else {
            System.out.printf("The number %d is not present in the array.\n", targetNumber);
        }
    }
	
	

}
