package com.jms;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by wjk on 16/3/14.
 */
public interface IService extends Remote {
    //声明服务器端必须提供的服务
    String service(String content) throws RemoteException;
}
