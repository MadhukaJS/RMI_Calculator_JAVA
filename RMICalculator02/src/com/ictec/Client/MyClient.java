package com.ictec.Client;

import com.ictec.MyCal.Calculator;

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
            int addition=myCal.AddTwoInteger(12,20);
            System.out.println("Addition is :"+addition);

            int substraction=myCal.SubTwoInteger(30,20);
            System.out.println("substraction is: "+substraction);

            int multiplication=myCal.MulTwoInteger(12,2);
            System.out.println("multiplication is :"+multiplication);

            int devision=myCal.DevTwoInteger(12,2);
            System.out.println("Devision is:"+devision);


        } catch (RemoteException e) {
            throw new RuntimeException(e);
        } catch (NotBoundException e) {
            throw new RuntimeException(e);
        }
        catch (ArithmeticException e){
            System.out.println("cant devide by zero"+e.getMessage());
        }
}
