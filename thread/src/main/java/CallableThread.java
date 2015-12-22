import java.util.concurrent.*;

/**
 * Created by wjk on 15/12/22.
 */
public class CallableThread implements Callable {
    public Object call() throws Exception {
        System.out.println("进入call()方法的时间: " + System.currentTimeMillis());
        Thread.sleep(100);
        return "100";
    }

    public static void main(String[] args) {
        ExecutorService service = Executors.newCachedThreadPool();
        Future<String> result = service.submit(new CallableThread());
        service.shutdown();

        String str = null;

        try {
            Thread.sleep(50);
            str = result.get();

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        System.out.println("获得call()方法的返回值 " + str + "时间是 " + System.currentTimeMillis());
    }
}
