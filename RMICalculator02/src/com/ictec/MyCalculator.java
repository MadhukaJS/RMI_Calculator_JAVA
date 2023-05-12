package com.ictec;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyCalculator extends UnicastRemoteObject implements calculator {
    protected MyCalculator() throws RemoteException {
    }


}
