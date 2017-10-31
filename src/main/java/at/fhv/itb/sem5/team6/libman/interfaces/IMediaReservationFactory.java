package at.fhv.itb.sem5.team6.libman.interfaces;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IMediaReservationFactory extends Remote{
    public IMediaReservation create() throws RemoteException;
}
