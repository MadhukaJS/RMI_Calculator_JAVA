package com.ictech.client;

import com.ictech.Areaf.AreaFinder;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MyClient {
    public static void main(String[] args) {
        Registry myReg=null;

        try {
            myReg= LocateRegistry.getRegistry("localhost",54321);
            AreaFinder myFinder=(AreaFinder) myReg.lookup("My area finder server");


            //invoke the methods
            int area=myFinder.square(12,10);
            System.out.println("area is :"+area);


        } catch (RemoteException | NotBoundException e) {
            throw new RuntimeException(e);
        }
    }
}
