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
}
