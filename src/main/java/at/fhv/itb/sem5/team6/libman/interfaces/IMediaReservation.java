package at.fhv.itb.sem5.team6.libman.interfaces;

import at.fhv.itb.sem5.team6.libman.model.Customer;
import at.fhv.itb.sem5.team6.libman.model.Media;
import at.fhv.itb.sem5.team6.libman.model.Reservation;

import javax.validation.constraints.NotNull;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IMediaReservation extends Remote {
    Reservation reserve(@NotNull Media media, @NotNull Customer customer) throws RemoteException;

    void cancel(@NotNull Reservation reservation) throws RemoteException;
}
