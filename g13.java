package leetcode;


import java.util.Arrays;
import java.util.Scanner;

public class g13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        int result=0;
        System.out.print("Reverse is : ");
        for(int i=size-1;i>=0;i--){
             result = arr[i];
            System.out.print(result+" ");
        }
        System.out.println("");
        System.out.println("AVG IS " + avg(arr));
    }

    public static int avg(int [] arr){
        int sum = 0;
        for(int i=0; i<arr.length; i++ ){
            sum = sum + arr[i];
        }
        return sum/arr.length;
    }
}
