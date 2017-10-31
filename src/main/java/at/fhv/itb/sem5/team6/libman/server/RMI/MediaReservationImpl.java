package at.fhv.itb.sem5.team6.libman.server.RMI;

import at.fhv.itb.sem5.team6.libman.interfaces.IMediaReservation;
import at.fhv.itb.sem5.team6.libman.server.model.Customer;
import at.fhv.itb.sem5.team6.libman.server.model.Media;
import at.fhv.itb.sem5.team6.libman.server.model.Reservation;

import java.rmi.RemoteException;
import java.rmi.server.RMIClientSocketFactory;
import java.rmi.server.RMIServerSocketFactory;
import java.rmi.server.UnicastRemoteObject;

public class MediaReservationImpl extends UnicastRemoteObject implements IMediaReservation{
    protected MediaReservationImpl() throws RemoteException {
    }

    protected MediaReservationImpl(int port) throws RemoteException {
        super(port);
    }

    protected MediaReservationImpl(int port, RMIClientSocketFactory csf, RMIServerSocketFactory ssf) throws RemoteException {
        super(port, csf, ssf);
    }

    @Override
    public Reservation reserve(Media media, Customer customer) throws RemoteException {
        System.out.println("reservation worked");
        return null;
    }

    @Override
    public void cancel(Reservation reservation) throws RemoteException {

    }
}
