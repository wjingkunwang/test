package RMI.demo1;

import javax.naming.Context;
import javax.naming.InitialContext;

/**
 * Created by wjk on 16/3/3.
 *
 */
public class Server {
    public static void main(String[] args) {
        try {
            //实例化实现IService接口的远程服务ServiceImpl对象
            IService service02 = new ServiceImpl("service02");
            //初始化命名空间
            Context namingContext = new InitialContext();
            namingContext.rebind("rmi://localhost/service02", service02);

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("服务器向命名表注册了1个远程服务对象");
    }
}
