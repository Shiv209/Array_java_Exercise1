//average , highest value and lowest value
import java.util.Scanner;
  class Average {
     void avg(int... x) {

         float sum = 0;
         for (int i = 0; i < x.length; i++) {

             sum += x[i];
         }
         System.out.println(" Average is :" + (float)(sum/x.length));
     }
 }
  class Max_Min{
    void max(int...x) {
        int max = x[0];
        for ( int i=0 ; i<x.length ; i++){
            if(x[i]>max){
                max = x[i];
            }
        }
        System.out.println("maximum value from an array is: "+max);
    }
    void min(int...x) {
        int min = x[0];
        for( int i=0 ; i<x.length ; i++){
            if(x[i]<min){
                min = x[i];
            }
        }
        System.out.println("minimum value from an array is: "+min);
    }

 }


public class P1 {

    public static void main(String[] args) {

        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of elemnts :");
        n = sc.nextInt();

        int[] num = new int[10];
        System.out.println("enter the elements of array");
        for(int i = 0 ; i <n ; i++){

            num[i] = sc.nextInt();

        }
       Average a1 = new Average();
        a1.avg(num);

      Max_Min m1 = new Max_Min();
       m1.max(num);

      Max_Min m2 = new Max_Min();
       m2.min(num);


    }
}

