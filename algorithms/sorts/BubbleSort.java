package algorithms.sorts;
import java.util.Arrays;

public class BubbleSort {
    public static void sortAscending(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int exch = 0;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    exch++;
                }
                System.out.println(Arrays.toString(arr));
            }
            if(exch==0) break;
        }
    }

    public static void sortDescending(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] < arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 0};
        sortAscending(arr);
        System.out.println(Arrays.toString(arr));
//        sortDescending(arr);
//        System.out.println(Arrays.toString(arr));
    }
}
