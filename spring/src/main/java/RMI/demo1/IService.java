package RMI.demo1;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by wjk on 16/3/3.
 */
public interface IService  extends Remote {
    //声明服务器必须向客户端提供的服务
    String service(String content) throws RemoteException;
}
