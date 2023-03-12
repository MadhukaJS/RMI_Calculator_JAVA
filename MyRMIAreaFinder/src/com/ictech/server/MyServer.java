package com.ictech.server;

import com.ictech.Areaf.AreaFinder;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MyServer {
    public static void main(String[] args) {
        try {
        
        myReg= LocateRegistry.createRegistry("54321");
        myFinder = new AreaFinder();
        myReg.rebind("My area finder server",myFinder);
        }
        catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
