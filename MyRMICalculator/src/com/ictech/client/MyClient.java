package com.ictech.client;

import com.ictech.calc.Calculator;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MyClient {
    public static void main(String[] args) {
        //locate the registry
        Registry myReg= null;
        try {
            myReg = LocateRegistry.getRegistry("localhost", 54321);

            //locate the remote object
            Calculator myCal = (Calculator) myReg.lookup("My Calculator server");


            //invoke the methods
            int addition=myCal.addTwoIntegers(12,20);
            System.out.println("Addition is "+addition);

            int substraction=myCal.subTwoNumbers(30,20);
            System.out.println("substraction is "+substraction);

            int multiplication=myCal.MulTwoNumbers(12,2);
            System.out.println("multiplication is "+multiplication);

            int devision=myCal.DevtwoNumbers(12,2);
            System.out.println("Devision"+devision);


        } catch (RemoteException e) {
            throw new RuntimeException(e);
        } catch (NotBoundException e) {
            throw new RuntimeException(e);
        }
    }
}
