package at.fhv.itb.sem5.team6.libman.interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IPhysicalMediaFactory extends Remote {
    public IPhysicalMedia create() throws RemoteException;
}
