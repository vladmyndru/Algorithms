package app;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] numbers = {33, 11, 21, 16, 2, 1, 12, 99, 88, 77, 78, 22, 66, 98, 55};

        System.out.println("I. Not-Sorted data:");
        for (int element : numbers)
            System.out.print(element + " ");

        for (int i = 1; i < numbers.length; i++) {
            int key = numbers[i];
            int j = i - 1;
            while (j >= 0 && key < numbers[j]) {
                numbers[j + 1] = numbers[j];
                j--;
            }
            numbers[j + 1] = key;
        }
        System.out.println("\nII. Sorted data:");
        for (int element : numbers)
            System.out.print(element + " ");

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nInput int number: ");
        int key = scanner.nextInt();

        int low = 0;
        int high = numbers.length - 1;
        int idx = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (numbers[mid] == key) {
                idx = mid;
                break;
            } else if (numbers[mid] > key) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        if (idx == -1)
            System.out.println("Value " + key + " is absent.");
        else
            System.out.println("Value " + key + " is at index " + idx);
    }
}
