package innerClass;

/**
 * 创建内部类
 * 典型的用法是外部类的一个方法返回一个指向内部类的引用
 */
public class Parcel2 {
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

    public Destination whereTo(String s){
        return  new Destination(s);
    }

    public Contents contents(){
       return new Contents();
    }

    public void ship(String desc) {
        //Contents内部类实例
        Contents c = contents();
        //Destination内部类实例
        Destination d = whereTo(desc);
        System.out.println(d.readLabel());
    }

    public static void main(String[] args) {
        Parcel2 p = new Parcel2();
        p.ship("Tasmania");

        Parcel2 q = new Parcel2();
        //如果想从外部类的非静态方法之外的任意位置创建某个内部类的
        //对象,那么就必须像下面的例子指明这个对象的类型:OuterClassName.InnerClassName
        Parcel2.Contents c = q.contents();
        Parcel2.Destination d = q.whereTo("from");
        System.out.println(d.readLabel());
    }
}
