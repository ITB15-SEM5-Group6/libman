package at.fhv.itb.sem5.team6.libman.server.RMI;

import at.fhv.itb.sem5.team6.libman.interfaces.IMediaSearch;
import at.fhv.itb.sem5.team6.libman.server.model.Availability;
import at.fhv.itb.sem5.team6.libman.server.model.Media;
import at.fhv.itb.sem5.team6.libman.server.model.MediaType;
import at.fhv.itb.sem5.team6.libman.server.persistence.MediaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;

import java.io.Serializable;
import java.rmi.RemoteException;
import java.rmi.server.RMIClientSocketFactory;
import java.rmi.server.RMIServerSocketFactory;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

public class MediaSearchImpl extends UnicastRemoteObject implements IMediaSearch {

    private MediaRepository mediaRepository;

    protected MediaSearchImpl(MediaRepository mediaRepository) throws RemoteException {
        this.mediaRepository = mediaRepository;
    }

    protected MediaSearchImpl(int port, MediaRepository mediaRepository) throws RemoteException {
        super(port);
        this.mediaRepository = mediaRepository;
    }

    protected MediaSearchImpl(int port, RMIClientSocketFactory csf, RMIServerSocketFactory ssf, MediaRepository mediaRepository) throws RemoteException {
        super(port, csf, ssf);
        this.mediaRepository = mediaRepository;
    }


    @Override
    public List<Media> findAll() throws RemoteException {
        System.out.println("findAll");
        return mediaRepository.findAll();
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
