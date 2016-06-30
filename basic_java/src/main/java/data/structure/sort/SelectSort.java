package data.structure.sort;

/**
 * Created by wjk on 16/6/29.
 */
public class SelectSort {
    public static void sort(int[] arr) {
        int len = arr.length;
        int index = 0;
        for (int i = 0; i < len; i++) {
            int temp = arr[i];

            for (int j = i + 1; j < len; j++) {
                if (temp < arr[j]) {
                    temp = arr[j];
                    index = j;
                }
            }
            if (arr[i] != temp) {
                SortUtils.swap(arr, i, index);
            }

        }
    }
}
