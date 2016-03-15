package com.jms;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * Created by wjk on 16/3/14.
 */
// UnicastRemoteObject用于导出的远程对象和获得与该远程对象通信的存根。
public class ServiceImpl extends UnicastRemoteObject implements IService {

    private String name;

    public ServiceImpl(String name) throws RemoteException {
        this.name = name;
    }

    public String service(String content) {
        return "server >> " + content;
    }
}