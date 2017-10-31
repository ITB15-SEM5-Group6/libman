package at.fhv.itb.sem5.team6.libman.shared.interfaces;

import at.fhv.itb.sem5.team6.libman.server.model.*;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface ILibrary extends Remote {
    void hello() throws RemoteException;

    List<Media> findAllMedia() throws RemoteException;

    Reservation reserveMedia(@NotNull Media media, @NotNull Customer customer) throws RemoteException;

    void cancelReservation(@NotNull Reservation reservation) throws RemoteException;

    //search by id
    Media findOneMedia(@NotNull Serializable id) throws RemoteException;

    //search by text (like and ignorecase) over all properties
    List<Media> findAllMedia(@NotNull String text) throws RemoteException;

    //search by type
    List<Media> findAllMedia(@NotNull MediaType type) throws RemoteException;

    //search by availability
    List<Media> findAllMedia(@NotNull Availability availability) throws RemoteException;

    //search by text (like and ignorecase) and media and availability
    List<Media> findAllMedia(String text, MediaType type, Availability availability) throws RemoteException;

    Lending lendPhysicalMedia(@NotNull PhysicalMedia physicalMedia, @NotNull Customer customer) throws RemoteException;

    void returnPhysicalMedia(@NotNull Lending lending) throws RemoteException;

    void extendLending(@NotNull Lending lending) throws RemoteException;
}
