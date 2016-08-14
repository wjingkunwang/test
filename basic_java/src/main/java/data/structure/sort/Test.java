package data.structure.sort;

/**
 * Created by wjk on 16/6/29.
 */
public class Test {
    public static void main(String[] args) {
        int arr[] = {
                1, 34, 2, 65
//                ,39, 3, 89
//                1, 2, 3, 4, 5, 6, 7, 8
        };

        BubbleSort.sort2(arr);
        for (int item : arr) {
            System.out.println(item);
        }

    }

}
