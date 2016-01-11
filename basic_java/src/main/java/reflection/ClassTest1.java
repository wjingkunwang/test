package reflection;

/**
 * Created by wjk on 16/1/11.
 */
public class ClassTest1 {
    public static void main(String[] args) throws ClassNotFoundException {
        // (1)forName()获取Class对象(最常用)
        Class clazz1 = Class.forName("reflection.Student");
        System.out.println(clazz1.hashCode());
        // (2).class获取Class对象
        Class clazz2 = String.class;
        System.out.println(clazz2.hashCode());
        // (3)getClass()获取Class对象
        // 一个类只对应一个Class对象
        Class clazz3 = "reflection.Student".getClass();
        System.out.println(clazz3.hashCode());


        //每个数组属于被映射为Class对象的一个类，所有具有相同元素类型和维数的数组都共享该Class对象
        int[] arr01 = new int[10];
        int[][] arr02 = new int[30][3];
        int[] arr03 = new int[30];
        double[] arr04 = new double[10];

        System.out.println(arr01.getClass().hashCode());
        System.out.println(arr02.getClass().hashCode());
        System.out.println(arr03.getClass().hashCode());
        System.out.println(arr04.getClass().hashCode());

    }
}
