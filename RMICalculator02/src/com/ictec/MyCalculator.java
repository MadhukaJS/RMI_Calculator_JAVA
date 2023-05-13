package com.ictec;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyCalculator extends UnicastRemoteObject implements calculator {


    protected MyCalculator() throws RemoteException {
    }

    @Override
    public int addtwointeger(int x, int y) throws RemoteException {
        return 0;
    }

    @Override
    public int devTwointeger(int x, int y) throws RemoteException {
        return 0;
    }

    @Override
    public int subTwoInteger(int x, int y) throws RemoteException {
        return 0;
    }

    @Override
    public int mulTwoInteger(int x, int y) throws RemoteException {
        return 0;
    }
}
