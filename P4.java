import java.util.Scanner;
public class P4 {
    public static void main(String[] args) {
        int n, temp = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements");
        n = sc.nextInt();
        int[] arr = new int[10];
        int[] num = new int[10];
        System.out.println("Enter elements ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
        for (int i = 0; i < n; i++) {
            num[i] = arr[i];
        }
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        System.out.println("Elements after sorted are :");
        int count = 0;
        for (int x : arr) {
            System.out.println("x[" + count + "] = " + x);
            count++;
            if (count == 5)
                break;
        }
        if (arr[0] == num[0] && arr[1] == num[1] && arr[2] == num[2] && arr[3] == num[3] && arr[4] == num[4] && arr[5] == num[5])
            System.out.println("Elements in an array are sorted");
        else
            System.out.println("Elements in an array are not sorted");

    }
}
