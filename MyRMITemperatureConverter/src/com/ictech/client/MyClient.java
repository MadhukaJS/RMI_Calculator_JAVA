package com.ictech.client;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class MyClient {
    public static void main(String[] args) {
        Registry myReg=null;

        myReg=LocateRegistry.getRegistry("localhost",54321);


    }

}
