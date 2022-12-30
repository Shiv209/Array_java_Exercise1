import java.util.Arrays; import java.util.Random;
public class P2 {
    public static void main(String[] args) {
        int[] num = new int[10];
        for (int j=0; j<100 ;j++ ) {
       Random rand = new Random();
            int temp = 1 + rand.nextInt(10);
            System.out.print(temp+" ");
            int i = 0;
            while (i<=100) {
                if(temp == (i + 1)){ num[i] = num[i] + 1;
                }
                i++; }
        }
        System.out.println();
        System.out.println(Arrays.toString(num));
        for (int i = 0;i<num.length ;i++ ) {
            System.out.println((i+1) + ": "+ num[i]);
        }
    }
}