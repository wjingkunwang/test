package data.structure.sort;

/**
 * 实现逻辑a[i]中填充一个值一直往下比较遇到比它大的替换
 */
public class BubbleSort {
    public static void sort(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (arr[i] < arr[j]) {
                   SortUtils.swap(arr, i, j);
                }
                System.out.println(1);
            }
        }
    }

}
