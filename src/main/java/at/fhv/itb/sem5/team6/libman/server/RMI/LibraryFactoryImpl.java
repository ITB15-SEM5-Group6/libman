package at.fhv.itb.sem5.team6.libman.server.RMI;

import at.fhv.itb.sem5.team6.libman.server.application.LibraryController;
import at.fhv.itb.sem5.team6.libman.shared.interfaces.ILibrary;
import at.fhv.itb.sem5.team6.libman.shared.interfaces.ILibraryFactory;

import java.rmi.RemoteException;

public class LibraryFactoryImpl implements ILibraryFactory {

    private final LibraryController libraryController;

    public LibraryFactoryImpl(LibraryController libraryController) {
        this.libraryController = libraryController;
    }

    @Override
    public ILibrary create() throws RemoteException {
        return new LibraryImpl(libraryController);
    }
}
