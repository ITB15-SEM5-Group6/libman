package at.fhv.itb.sem5.team6.libman.interfaces;

import java.rmi.Remote;

public interface IMediaReservationFactory extends Remote{
    public IMediaReservation create();
}
