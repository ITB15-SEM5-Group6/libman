package at.fhv.itb.sem5.team6.libman.interfaces;

import at.fhv.itb.sem5.team6.libman.model.Availability;
import at.fhv.itb.sem5.team6.libman.model.Media;
import at.fhv.itb.sem5.team6.libman.model.MediaType;

import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface IMediaSearch extends Remote {

    //all
    List<Media> findAll() throws RemoteException;

    //search by id
    Media findOne(Serializable id) throws RemoteException;

    //search by text (like and ignorecase) over all properties
    List<Media> findAll(String text) throws RemoteException;

    //search by type
    List<Media> findAll(MediaType type) throws RemoteException;

    //search by availability
    List<Media> findAll(Availability availability) throws RemoteException;

    //search by text (like and ignorecase) and media and availability
    List<Media> findAll(String text, MediaType type, Availability availability) throws RemoteException;

}
