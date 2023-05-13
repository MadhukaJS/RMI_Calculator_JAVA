package com.ictec.MyCal;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Calculator extends UnicastRemoteObject implements MyCalculator {


    protected Calculator() throws RemoteException {
    }

    @Override
    public int AddTwoInteger(int x, int y) throws RemoteException {
        return 0;
    }

    @Override
    public int SubTwoInteger(int x, int y) throws RemoteException {
        return 0;
    }

    @Override
    public int MulTwoInteger(int x, int y) throws RemoteException {
        return 0;
    }

    @Override
    public int DevTwoInteger(int x, int y) throws RemoteException {
        return 0;
    }
}
