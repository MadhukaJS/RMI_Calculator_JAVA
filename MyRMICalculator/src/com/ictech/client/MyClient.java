package com.ictech.client;

import com.ictech.calc.Calculator;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MyClient {
    public static void main(String[] args) {
        //locate the registry
        Registry myReg= LocateRegistry  .getRegistry("localhost",54321);

        //locate the remote object
        Calculator myCal=(Calculator) myReg.lookup("My Calculator server") ;
        
        //invoke the methods

    }
}
