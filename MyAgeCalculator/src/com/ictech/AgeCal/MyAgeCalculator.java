package com.ictech.AgeCal;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyAgeCalculator extends UnicastRemoteObject implements AgeCalculator {
    public MyAgeCalculator() throws RemoteException {
    }
}
