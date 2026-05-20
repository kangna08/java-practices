import java.util.Scanner;
public class SearchElement {
    public static void search(int arr[], int value) {
            boolean found = false;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == value) {
                    System.out.println("Element found at index: " + i);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Element not found");
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter size of array: ");
            int n = sc.nextInt();

            int arr[] = new int[n];

            System.out.println("Enter elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            System.out.print("Enter element to search: ");
            int value = sc.nextInt();

            search(arr, value);
        }
    }

