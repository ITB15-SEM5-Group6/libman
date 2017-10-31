package at.fhv.itb.sem5.team6.libman.server.RMI;

import at.fhv.itb.sem5.team6.libman.interfaces.IMediaSearch;
import at.fhv.itb.sem5.team6.libman.interfaces.IMediaSearchFactory;

import java.rmi.RemoteException;

public class MediaSearchFactoryImpl implements IMediaSearchFactory {
    @Override
    public IMediaSearch create() throws RemoteException {
        return null;
    }
}
