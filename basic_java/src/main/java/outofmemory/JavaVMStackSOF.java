package outofmemory;

/**
 * 虚拟栈OOM
 * -Xss512k
 */
public class JavaVMStackSOF {
    private int stackLenqth = 1;

    public void stackLeek() {
        stackLenqth++;
        stackLeek();
    }

    public static void main(String[] args) {
        JavaVMStackSOF stackSOF = new JavaVMStackSOF();
        stackSOF.stackLeek();
    }
}
