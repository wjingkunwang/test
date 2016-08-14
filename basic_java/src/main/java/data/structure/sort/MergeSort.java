package data.structure.sort;

import java.util.Arrays;

/**
 * Created by wjk on 16/6/30.
 */
public class MergeSort {
    public static void sort(int[] arr) {

        if (arr.length > 0) {    //查看数组是否为空
            mergeSort(arr, 0, arr.length - 1);
        }
    }
    public static void mergeSort(int[] data, int left, int right) {
        if(left<right){
            //找出中间索引
            int center=(left+right)/2;
            //对左边数组进行递归
            mergeSort(data,left,center);
            //对右边数组进行递归
            mergeSort(data,center+1,right);
            //合并
            merge(data,left,center,right);

        }
    }
    public static void merge(int[] data, int left, int center, int right) {
        int [] tmpArr=new int[data.length];
        int mid=center+1;
        //third记录中间数组的索引
        int third=left;
        int tmp=left;
        while(left<=center&&mid<=right){
            //从两个数组中取出最小的放入中间数组
            if(data[left]<=data[mid]){
                tmpArr[third++]=data[left++];
            }else{
                tmpArr[third++]=data[mid++];
            }
        }
        //剩余部分依次放入中间数组
        while(mid<=right){
            tmpArr[third++]=data[mid++];
        }
        while(left<=center){
            tmpArr[third++]=data[left++];
        }
        //将中间数组中的内容复制回原数组
        while(tmp<=right){
            data[tmp]=tmpArr[tmp++];
        }
        System.out.println(Arrays.toString(data));
    }
}
