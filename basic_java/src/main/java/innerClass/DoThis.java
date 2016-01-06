package innerClass;

/**
 * 如何生成外部类对象的引用?
 * 外部类的名字后面紧跟.this(编译期知晓并检查引用是否是准确的类型)
 */
public class DoThis {
    void f(){
        System.out.println("DoThis.f()");
    }
    public class Inner{
        public DoThis outer(){
            //外部类后面紧跟.this
            return DoThis.this;
        }
    }

    public Inner inner(){
        return new Inner();
    }

    public static void main(String[] args) {
        DoThis dt = new DoThis();
        DoThis.Inner dti = dt.inner();
        //调用外部类DoThis的f()方法
        dti.outer().f();
    }
}
