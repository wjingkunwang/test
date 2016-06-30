package data.structure.sort;

/**
 * Created by wjk on 16/6/29.
 */
public class SortUtils {
    public static void swap(int[] arr, int i, int j) {
        int temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
