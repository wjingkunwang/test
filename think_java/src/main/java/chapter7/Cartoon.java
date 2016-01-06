package chapter7;

/**
 * Created by wjk on 15/12/29.
 */
public class Cartoon extends Drawing{
    public Cartoon() {//不创建,编译器会加一个默认得构造器
        System.out.println("cartoon");
    }

    public static void main(String[] args) {
        Cartoon cartoon = new Cartoon();
    }
}

class Art {
    public Art() {
        System.out.println("art");
    }
}

class Drawing extends Art{
    public Drawing() {
        System.out.println("drawing");
    }
}

