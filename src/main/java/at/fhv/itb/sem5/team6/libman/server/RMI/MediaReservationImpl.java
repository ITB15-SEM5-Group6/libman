package at.fhv.itb.sem5.team6.libman.server.RMI;

import at.fhv.itb.sem5.team6.libman.interfaces.IMediaReservation;
import at.fhv.itb.sem5.team6.libman.server.model.Customer;
import at.fhv.itb.sem5.team6.libman.server.model.Media;
import at.fhv.itb.sem5.team6.libman.server.model.Reservation;

import java.rmi.RemoteException;

public class MediaReservationImpl implements IMediaReservation{
    @Override
    public Reservation reserve(Media media, Customer customer) throws RemoteException {
        return null;
    }

    @Override
    public void cancel(Reservation reservation) throws RemoteException {

    }
}
