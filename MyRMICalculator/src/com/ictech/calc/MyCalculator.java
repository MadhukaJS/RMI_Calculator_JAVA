package com.ictech.calc;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyCalculator extends UnicastRemoteObject implements Calculator {

    public MyCalculator() throws RemoteException {
    }

    @Override
    public int addTwoIntegers(int x, int y) throws RemoteException {
        return (x+y);
    }

    @Override
    public int subTwoNumbers(int x, int y) throws RemoteException {
        return (x-y);
    }

    @Override
    public int MulTwoNumbers(int x, int y) throws RemoteException {
        return (x*y);
    }

    @Override
    public int DevtwoNumbers(int x, int y) throws RemoteException {
        return (x/y);
    }
}
