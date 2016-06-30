package data.structure.sort;

/**
 * Created by wjk on 16/6/23.
 */
public class InsetSort {
    public static void sort(int[] arr) {

        int temp = 0;
        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            temp = arr[i];
            for (; j >= 0 && temp > arr[j]; j--) {
                arr[j + 1] = arr[j];  //将大于temp的值整体后移一个单位
            }
            arr[j + 1] = temp;
        }
    }
}
