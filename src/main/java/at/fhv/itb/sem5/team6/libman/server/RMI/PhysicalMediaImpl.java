package at.fhv.itb.sem5.team6.libman.server.RMI;

import at.fhv.itb.sem5.team6.libman.interfaces.IPhysicalMedia;
import at.fhv.itb.sem5.team6.libman.server.model.Customer;
import at.fhv.itb.sem5.team6.libman.server.model.Lending;
import at.fhv.itb.sem5.team6.libman.server.model.PhysicalMedia;

import java.rmi.RemoteException;

public class PhysicalMediaImpl implements IPhysicalMedia{
    @Override
    public Lending lend(PhysicalMedia physicalMedia, Customer customer) throws RemoteException {
        return null;
    }

    @Override
    public void returnMedia(Lending lending) throws RemoteException {

    }

    @Override
    public void extendLend(Lending lending) throws RemoteException {

    }
}
