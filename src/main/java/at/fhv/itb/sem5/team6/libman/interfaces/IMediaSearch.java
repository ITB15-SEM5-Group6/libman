package at.fhv.itb.sem5.team6.libman.interfaces;

import at.fhv.itb.sem5.team6.libman.server.model.Availability;
import at.fhv.itb.sem5.team6.libman.server.model.Media;
import at.fhv.itb.sem5.team6.libman.server.model.MediaType;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface IMediaSearch extends Remote {

    //all
    List<Media> findAll() throws RemoteException;

    //search by id
    Media findOne(@NotNull Serializable id) throws RemoteException;

    //search by text (like and ignorecase) over all properties
    List<Media> findAll(@NotNull String text) throws RemoteException;

    //search by type
    List<Media> findAll(@NotNull MediaType type) throws RemoteException;

    //search by availability
    List<Media> findAll(@NotNull Availability availability) throws RemoteException;

    //search by text (like and ignorecase) and media and availability
    List<Media> findAll(String text, MediaType type, Availability availability) throws RemoteException;

}
