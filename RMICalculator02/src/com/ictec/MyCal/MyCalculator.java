package com.ictec.MyCal;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyCalculator extends Remote {

    public int AddTwoInteger(int x,int y) throws RemoteException;
    public int SubTwoInteger(int x,int y) throws RemoteException;
    public int MulTwoInteger(int x,int y) throws RemoteException;

    public int DevTwoInteger(int x,int y) throws RemoteException;

}
