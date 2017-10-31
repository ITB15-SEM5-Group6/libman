package at.fhv.itb.sem5.team6.libman.interfaces;

import java.rmi.Remote;

public interface IMediaSearchFactory extends Remote {
    public IMediaSearch create();
}
