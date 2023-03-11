package com.ictech.Areaf;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyAreaFinder extends Remote {
    public int square(int l,int w) throws RemoteException;

}
