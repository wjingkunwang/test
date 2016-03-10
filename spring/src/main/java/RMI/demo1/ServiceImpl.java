package RMI.demo1;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by wjk on 16/3/3.
 */
public class ServiceImpl extends UnicastRemoteObject implements IService {

    private String name;

    public ServiceImpl(String name) throws RemoteException {
        this.name = name;
    }


    public String service(String content) {
        return "server >> " + content;
    }
}
