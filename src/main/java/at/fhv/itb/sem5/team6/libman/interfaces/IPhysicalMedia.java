package at.fhv.itb.sem5.team6.libman.interfaces;

import at.fhv.itb.sem5.team6.libman.server.model.Customer;
import at.fhv.itb.sem5.team6.libman.server.model.Lending;
import at.fhv.itb.sem5.team6.libman.server.model.PhysicalMedia;

import javax.validation.constraints.NotNull;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IPhysicalMedia extends Remote {
    Lending lend(@NotNull PhysicalMedia physicalMedia, @NotNull Customer customer) throws RemoteException;

    void returnMedia(@NotNull Lending lending) throws RemoteException;

    void extendLend(@NotNull Lending lending) throws RemoteException;
}
