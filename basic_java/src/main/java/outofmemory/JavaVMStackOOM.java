package outofmemory;

/**
 * 创建线程导致OOM
 * VM Args: -Xss2M
 */
public class JavaVMStackOOM {
    private void  dontStop(){
        while (true){

        }
    }

    public void stackLeakByThread(){
        while (true){
            Thread thread = new Thread(new Runnable() {
                public void run() {
                    dontStop();
                }
            });
        }
    }

    public static void main(String[] args) {
        JavaVMStackOOM stackOOM = new JavaVMStackOOM();
        stackOOM.stackLeakByThread();

    }
}
