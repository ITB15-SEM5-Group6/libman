package at.fhv.itb.sem5.team6.libman.server.RMI;

import at.fhv.itb.sem5.team6.libman.interfaces.IMediaSearch;
import at.fhv.itb.sem5.team6.libman.server.model.Availability;
import at.fhv.itb.sem5.team6.libman.server.model.Media;
import at.fhv.itb.sem5.team6.libman.server.model.MediaType;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.util.List;

public class MediaSearchImpl implements IMediaSearch {
    @Override
    public List<Media> findAll() throws RemoteException {
        return null;
    }

    @Override
    public Media findOne(Serializable id) throws RemoteException {
        return null;
    }

    @Override
    public List<Media> findAll(String text) throws RemoteException {
        return null;
    }

    @Override
    public List<Media> findAll(MediaType type) throws RemoteException {
        return null;
    }

    @Override
    public List<Media> findAll(Availability availability) throws RemoteException {
        return null;
    }

    @Override
    public List<Media> findAll(String text, MediaType type, Availability availability) throws RemoteException {
        return null;
    }
}
