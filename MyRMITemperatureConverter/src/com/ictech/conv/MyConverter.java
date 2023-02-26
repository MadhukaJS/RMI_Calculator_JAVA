package com.ictech.conv;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyConverter extends UnicastRemoteObject implements Converter {

    public MyConverter() throws RemoteException {
    }

    @Override
    public int CelToFar(int x) throws RemoteException {
        return (x*9/5+32);
    }

    @Override
    public int FartoCel(int x) throws RemoteException {
        return 0;
    }

    @Override
    public int CeltoKel(int x) throws RemoteException {
        return 0;
    }

    @Override
    public int KeltoCel(int x) throws RemoteException {
        return 0;
    }
}
