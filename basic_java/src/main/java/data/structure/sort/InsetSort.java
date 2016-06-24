package data.structure.sort;

/**
 * Created by wjk on 16/6/23.
 */
public class InsetSort {
    public static void main(String[] args) {
        int a[] = {
                49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 5, 4, 62, 99, 98, 54, 56, 17, 18
        };

        int temp = 0;
        for (int i = 1; i < a.length; i++) {
            int j = i - 1;
            temp = a[i];
            for (; j >= 0 && temp < a[j]; j--) {
                a[j + 1] = a[j];  //将大于temp的值整体后移一个单位
            }
            a[j + 1] = temp;
        }

        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
    }
}
