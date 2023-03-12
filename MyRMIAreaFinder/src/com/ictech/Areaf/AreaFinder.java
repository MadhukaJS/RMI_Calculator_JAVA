package com.ictech.Areaf;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class AreaFinder extends UnicastRemoteObject implements MyAreaFinder{
    public AreaFinder() throws RemoteException {
    }

    @Override
    public int square(int l, int w) throws RemoteException {
        return (l*w);
    }
}
