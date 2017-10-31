package at.fhv.itb.sem5.team6.libman.server.RMI;

import at.fhv.itb.sem5.team6.libman.interfaces.IMediaReservation;
import at.fhv.itb.sem5.team6.libman.interfaces.IMediaReservationFactory;

import java.rmi.RemoteException;
import java.rmi.server.RMIClientSocketFactory;
import java.rmi.server.RMIServerSocketFactory;
import java.rmi.server.UnicastRemoteObject;

public class MediaReservationFactoryImpl implements IMediaReservationFactory {

    @Override
    public IMediaReservation create() throws RemoteException {
        return new MediaReservationImpl();
    }
}
