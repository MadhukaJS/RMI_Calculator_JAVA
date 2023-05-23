package com.ictec.server;

import com.ictec.MyCal.Calculator;
import com.ictec.MyCal.MyCalculator;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Myserver{
    public static void main(String[] args) {

        Registry myReg = null;
        try {
            myReg = LocateRegistry.createRegistry(54321);
            
            Calculator myCal = new MyCalculator();

            myReg.rebind("My Calculator server", myCal);

            System.out.println("My Calculator Server is running..");

        }
        catch (RemoteException e) {
            System.out.println("Exception in create registry"+e.getMessage());
        }
    }
}
