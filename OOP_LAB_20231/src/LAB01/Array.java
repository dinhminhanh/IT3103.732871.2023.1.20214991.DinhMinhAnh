//DinhMinhAnh20214991
//Example 6.5: Array.java
package LAB01;
import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input number of elements in the array
        System.out.print(" Dinh Minh Anh 20214991 - Enter the number of elements: ");
        int n = input.nextInt();
        double[] numbers = new double[n];

        // Input element
        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = input.nextDouble();
        }

        // Sort the elements in the array
        Arrays.sort(numbers);

        // Calculate the sum and average value
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        double average = sum / n;

        System.out.println("Sorted array: " + Arrays.toString(numbers));
        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average of array elements: " + average);

        input.close();
    }
}

