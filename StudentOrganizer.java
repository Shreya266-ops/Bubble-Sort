import java.util.Scanner;

public class StudentOrganizer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        int[] rollNumbers = new int[n];

        System.out.println("Enter " + n + " roll numbers:");
        for (int i = 0; i < n; i++) {
            rollNumbers[i] = sc.nextInt();
        }
        int comparisons = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {

                comparisons++;

                if (rollNumbers[j] > rollNumbers[j + 1]) {
                    // Swap
                    int temp = rollNumbers[j];
                    rollNumbers[j] = rollNumbers[j + 1];
                    rollNumbers[j + 1] = temp;
                }
            }
        }

        System.out.println("\nSorted roll numbers:");
        for (int i = 0; i < n; i++) {
            System.out.print(rollNumbers[i] + " ");
        }

        System.out.println("\nTotal element comparisons: " + comparisons);

        sc.close();
    }
}