package innerClass;

/**
 * 可以将一个类的定义放在一个另一个类的定义内部,这就是内部类
 *
 * (例子1:)外部类的方法中使用内部类
 */
public class Parcel1 {
    //内部类Contents
    class Contents {
        private int i = 11;

        public int value() {
            return i;
        }
    }
    //内部类Destination
    class Destination {
        private String label;

        public Destination(String whereTO) {
            this.label = whereTO;
        }

        String readLabel() {
            return label;
        }
    }

    public void ship(String desc) {
        //Contents内部类实例
        Contents c = new Contents();
        //Destination内部类实例
        Destination d = new Destination(desc);
        System.out.println(d.readLabel());
    }

    public static void main(String[] args) {
        Parcel1 p = new Parcel1();
        p.ship("Tasmania");
    }
}
