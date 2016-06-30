package data.structure.sort;

/**
 * Created by wjk on 16/6/30.
 */
public class QuickSort {
    public static void sort(int[] arr) {

        if (arr.length > 0) {    //查看数组是否为空
            quickSort(arr, 0, arr.length - 1);
        }
    }

    public static  void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int middle = getMiddle(arr, low, high);  //将list数组进行一分为二
            quickSort(arr, low, middle - 1);        //对低字表进行递归排序
            quickSort(arr, middle + 1, high);       //对高字表进行递归排序
        }
    }

    public static  int getMiddle(int[] arr, int low, int high) {
        int tmp = arr[low];    //数组的第一个作为中轴  
        while (low < high) {
            while (low < high && arr[high] > tmp) {
                high--;
            }
            arr[low] = arr[high];  //比中轴小的记录移到低端
            while (low < high && arr[low] < tmp) {
                low++;
            }
            arr[high] = arr[low];  //比中轴大的记录移到高端
        }
        arr[low] = tmp;  //中轴记录到尾
        return low;   //返回中轴的位置
    }
}
