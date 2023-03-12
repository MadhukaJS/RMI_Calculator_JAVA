package com.ictech.server;

import com.ictech.Areaf.AreaFinder;
import com.ictech.Areaf.MyAreaFinder;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MyServer {
    public static void main(String[] args) {


        Registry myReg=null;
        try {
        myReg=LocateRegistry.createRegistry(54321);

        AreaFinder myFinder=new AreaFinder();
        myReg.rebind("My area finder server",myFinder);

        System.out.println("___------------------area finder server is running___----------------");

        }
        catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
