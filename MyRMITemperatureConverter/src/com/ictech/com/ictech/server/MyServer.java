package com.ictech.com.ictech.server;

import com.ictech.conv.Converter;
import com.ictech.conv.MyConverter;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MyServer {
    public static void main(String[] args) {
        try {
            Registry myReg=null;

            myReg = LocateRegistry.createRegistry(54321);

            Converter MyCon = new MyConverter();

            myReg.rebind("My Converter Server", MyCon);


            System.out.println("!!---------My Converter Server Running--------!!");
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }
}
