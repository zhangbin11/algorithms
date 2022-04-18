package sort;

import edu.princeton.cs.algs4.In;

import java.util.Arrays;

public class InsertSort {

    public static void sort(int[] arr){
        if (arr == null || arr.length < 2) {
            return;
        }

        for(int i=1;i<arr.length;i++){

            for(int j =i;j>=1;j--){
                if(arr[j-1] > arr[j]){
                    int tmp =  arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = tmp;
                }
            }

        }

    }

    public static void main(String[] args) {
        int[] arr = {23,4455,566,21,45,6,348,8,9,0,1,23,5};
        sort(arr);
        System.out.print(Arrays.toString(arr));
     }
}
