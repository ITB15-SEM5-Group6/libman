package at.fhv.itb.sem5.team6.libman.server.RMI;

import at.fhv.itb.sem5.team6.libman.interfaces.IPhysicalMedia;
import at.fhv.itb.sem5.team6.libman.interfaces.IPhysicalMediaFactory;

import java.rmi.RemoteException;

public class PhsicalMediaFactoryImpl implements IPhysicalMediaFactory {

    @Override
    public IPhysicalMedia create() throws RemoteException{
        return null;
    }
}