package at.fhv.itb.sem5.team6.libman.shared.interfaces;

import at.fhv.itb.sem5.team6.libman.server.model.Availability;
import at.fhv.itb.sem5.team6.libman.server.model.MediaType;
import at.fhv.itb.sem5.team6.libman.shared.DTOs.immutable.ImmutableMedia;

import javax.validation.constraints.NotNull;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

public interface ILibrary extends Remote {

// Search

    // by id
    //ImmutableMedia findOneMedia(@NotNull Serializable id) throws RemoteException;

    // all
    List<ImmutableMedia> findAllMedia() throws RemoteException;

    // by text (like and ignorecase) over all properties
    List<ImmutableMedia> findAllMedia(@NotNull String text) throws RemoteException;

    // by type
    List<ImmutableMedia> findAllMedia(@NotNull MediaType type) throws RemoteException;

    // by availability
    List<ImmutableMedia> findAllMedia(@NotNull Availability availability) throws RemoteException;

    // by text (like and ignorecase) and media and availability
    List<ImmutableMedia> findAllMedia(String text, MediaType type, Availability availability) throws RemoteException;

// Reservation

    //Reservation reserveMedia(@NotNull Media media, @NotNull Customer customer) throws RemoteException;

    //void cancelReservation(@NotNull Reservation reservation) throws RemoteException;

// Lending

    //Lending lendPhysicalMedia(@NotNull PhysicalMedia physicalMedia, @NotNull Customer customer) throws RemoteException;

    //void returnPhysicalMedia(@NotNull Lending lending) throws RemoteException;

    //void extendLending(@NotNull Lending lending) throws RemoteException;
}
