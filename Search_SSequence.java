package question1;

import java.util.Scanner;

public class Search_SSequence {
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

	        // Get the number to be searched
	        System.out.print("Enter a number to be searched: ");
	        int targetNumber = scanner.nextInt();

	        // Count the occurrences of the target number in the array
	        int occurrences = 0;
	        for (int number : array) {
	            if (number == targetNumber) {
	                occurrences++;
	            }
	        }

	        // Display the result
	        if (occurrences > 0) {
	            System.out.printf("The number %d appears %d time(s) in the array.\n", targetNumber, occurrences);
	        } else {
	            System.out.printf("The number %d is not present in the array.\n", targetNumber);
	        }
	    }



}
