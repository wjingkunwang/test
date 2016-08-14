package data.structure.sort;

/**
 * Created by wjk on 16/6/29.
 */
public class ShellSort {
    public static void sort(int[] arr) {
        int len = arr.length;
        for (int increment = len / 2; increment > 0; increment /= 2) {
            for (int i = increment; i < arr.length; i++) {
                int j;
                int temp = arr[i];
                for (j = i; j >= increment; j -= increment) {
                    if (temp > arr[j - increment]) {
                        arr[j] = arr[j - increment];
                    } else {
                        break;
                    }
                }

                arr[j] = temp;
            }
        }
    }

    public static void sort1(int[] arr) {
        int length = arr.length;
        int increment = length;
        while (true) {
            increment = increment / 2;
            for (int i = 0; i < increment; i++) {
                for (int j = i+increment; j + increment < length; j += increment) {
                    int temp = arr[j];
                    int K = j - increment;
                    while (K >= 0 && arr[K] > temp) {
                        arr[K + increment] = arr[K];
                        K-=increment;
                    }
                    arr[K+increment] = temp;
                }
            }

            if (increment == 1) {
                break;
            }
        }
    }
}
