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
            System.out.println("Celcius value is Converting to Fahrenhite :"+convertion1);

            int convertion2=MyCon.FartoCel(10);
            System.out.println("Fahrenhite value is Converting to Celcius :"+convertion2);

            int convertion3=MyCon.CeltoKel(10);
            System.out.println("Celcius value is Converting to Kelvin :"+convertion3);

            int convertion4=MyCon.KeltoCel(10);
            System.out.println("Kelvin value is Converting to Celcius :"+convertion4);

        } catch (RemoteException | NotBoundException e) {
            throw new RuntimeException(e);
        }

    }

}
