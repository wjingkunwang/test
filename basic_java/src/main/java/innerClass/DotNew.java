package innerClass;

/**
 * 使用外部类对象之前时不能创建内部类对象的.这是因为内部类对象会暗暗地连接到创建它的外部类对象上.
 * 但是创建的是嵌套类(静态内部类),那它就不需要对外部类对象的引用
 * 创建某个内部类的对象,使用.new语法
 */
public class DotNew {

    public class Inner{}

    public static void main(String[] args) {
        DotNew dn = new DotNew();
        //创建内部类Inner
        DotNew.Inner inner = dn.new Inner();
    }
}
