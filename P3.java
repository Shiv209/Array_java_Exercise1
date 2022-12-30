
import java.util.Scanner;
public class P3 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        int a = 0;
        Scanner scan = new Scanner(System.in);
        while (a == 0) {
            System.out.println("Enter the class grade: ");
            int g = scan.nextInt();
            int i = 0;
            while (i < 3) {
                if (g == (i + 1)) {
                    arr[i] = arr[i] + 1;
                }
                i++;
            }
            System.out.println("For continue press any character, and for quit press 'q'.");
            char ch = scan.next().charAt(0);
            if (ch == 'q') a++;
        }
        scan.close();
        System.out.println();
        for (int i : arr)

            System.out.println(i);
    }
}

