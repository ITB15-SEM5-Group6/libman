package at.fhv.itb.sem5.team6.libman.shared.interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ILibraryFactory extends Remote {
    ILibrary create() throws RemoteException;
}
