package at.fhv.itb.sem5.team6.libman.server.RMI;

import at.fhv.itb.sem5.team6.libman.interfaces.IMediaSearch;
import at.fhv.itb.sem5.team6.libman.interfaces.IMediaSearchFactory;
import at.fhv.itb.sem5.team6.libman.server.persistence.MediaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.rmi.RemoteException;

public class MediaSearchFactoryImpl implements IMediaSearchFactory {

    @Autowired
    private MediaRepository mediaRepository;

    @Override
    public IMediaSearch create() throws RemoteException {
        return new MediaSearchImpl(mediaRepository);
    }
}
