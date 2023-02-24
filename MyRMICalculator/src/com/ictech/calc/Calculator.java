package com.ictech.calc;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Calculator extends Remote {
    public int addTwoIntegers(int x,int y) throws RemoteException;

    public int subTwoNumbers(int x,int y) throws RemoteException;

    public int MulTwoNumbers(int x,int y) throws RemoteException;

    public int DevtwoNumbers(int x,int y) throws RemoteException;

}
