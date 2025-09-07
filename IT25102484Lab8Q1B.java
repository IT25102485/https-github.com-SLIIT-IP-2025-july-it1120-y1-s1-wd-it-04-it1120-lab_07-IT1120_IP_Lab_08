import java.util.Scanner;

public class IT25102484Lab8Q1B {
    public static void main(String[] args) {
        int[] myArray = new int[5];
        int[] evenArray = new int[5];
        Scanner sc = new Scanner(System.in);

        // Input numbers
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter Number " + (i + 1) + ": ");
            myArray[i] = sc.nextInt();
        }

        // Copy even numbers to evenArray
        for (int i = 0; i < 5; i++) {
            if (myArray[i] % 2 == 0) {
                evenArray[i] = myArray[i];
            } else {
                evenArray[i] = 0;  // keep 0 for odd numbers
            }
        }

        // Print myArray contents
        System.out.println("\nmyArray Contents:");
        for (int i = 0; i < 5; i++) {
            System.out.print(myArray[i] + " ");
        }

        // Print evenArray contents
        System.out.println("\n\nevenArray Contents:");
        for (int i = 0; i < 5; i++) {
            System.out.print(evenArray[i] + " ");
        }
    }
}

