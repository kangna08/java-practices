import java.util.Scanner;

public class selectionsort {

    // Sorting Function
    public static void sorting(int arr[]) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {

            int min = i;

            for (int j = i + 1; j < n; j++) {

                if (arr[j] < arr[min]) {

                    min = j;

                }

            }

            // Swap
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;

        }

    }

    // Print Function
    public static void printArray(int arr[]) {

        for (int i = 0; i < arr.length; i++) {

            System.out.print(arr[i] + " ");

        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size:");

        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("Enter elements:");

        // Input array
        for (int i = 0; i < n; i++) {

            arr[i] = sc.nextInt();

        }

        // Function call
        sorting(arr);

        System.out.println("Sorted Array:");

        printArray(arr);

    }

}