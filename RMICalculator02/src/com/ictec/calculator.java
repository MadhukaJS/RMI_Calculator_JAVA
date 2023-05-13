package com.ictec;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface calculator extends Remote {

    public int addtwointeger (int x,int y) throws RemoteException;
    public int devTwointeger (int x,int y) throws RemoteException;

    public int subTwoInteger (int x,int y) throws RemoteException;
    public int mulTwoInteger (int x,int y) throws RemoteException;
}
