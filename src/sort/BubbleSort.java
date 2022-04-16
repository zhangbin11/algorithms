package sort;

public class BubbleSort {

    public static void sort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j++]) {
                    int tmp = arr[j];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }
}
