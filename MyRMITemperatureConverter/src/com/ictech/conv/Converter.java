package com.ictech.conv;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Converter extends Remote {

    public int CelToFar(int x) throws RemoteException;

    public int FartoCel(int x) throws RemoteException;

    public int CeltoKel(int x) throws RemoteException;

    public int KeltoCel(int x) throws RemoteException;
}
