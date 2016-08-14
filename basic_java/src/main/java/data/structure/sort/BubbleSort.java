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

    public static void sort1(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    SortUtils.swap(arr, j, j + 1);
                }
            }
        }

    }


    public static void sort2(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            for (int j = len - 1; j >   i; j--) {
                if (arr[j] < arr[j - 1]) {
                    SortUtils.swap(arr, j, j - 1);
                }
            }
        }

    }

}
