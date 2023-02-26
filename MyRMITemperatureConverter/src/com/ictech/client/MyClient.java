package com.ictech.client;

import com.ictech.conv.Converter;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MyClient {
    public static void main(String[] args) {

        Registry myReg=null;
        try {


        myReg=LocateRegistry.getRegistry("localhost",54321);

        Converter MyCon=(Converter) myReg.lookup("My Converter Server");

        //invoke the methods
            int convertion1=MyCon.CelToFar(10);
            System.out.println("The temperature is :"+convertion1);

            int convertion2=MyCon.FartoCel(10);
            System.out.println("The temperature is :"+convertion2);

            int convertion3=MyCon.CeltoKel(10);
            System.out.println("The temperature is :"+convertion3);

            int convertion4=MyCon.KeltoCel(10);
            System.out.println("The temperature is :"+convertion4);

        } catch (RemoteException | NotBoundException e) {
            throw new RuntimeException(e);
        }

    }

}
