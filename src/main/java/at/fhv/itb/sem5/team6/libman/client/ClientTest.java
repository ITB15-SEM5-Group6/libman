package at.fhv.itb.sem5.team6.libman.client;

import at.fhv.itb.sem5.team6.libman.client.presentation.ClientGUI;
import at.fhv.itb.sem5.team6.libman.interfaces.IMediaReservation;
import at.fhv.itb.sem5.team6.libman.interfaces.IMediaReservationFactory;
import at.fhv.itb.sem5.team6.libman.server.model.Customer;
import at.fhv.itb.sem5.team6.libman.server.model.Media;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.rmi.UnexpectedException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Locale;

import static javafx.application.Application.launch;

public class ClientTest extends Application {

    static String host = "localhost";
    static int port = 1099;


    @Override
    public void start(Stage primaryStage) throws Exception {
        Locale.setDefault(Locale.UK);

        ClientGUI gui = new ClientGUI();
        gui.start(primaryStage);
    }

    public static void main(String[] args) {
        /*

        try {
            Registry registry = LocateRegistry.getRegistry(host,port);


            IMediaReservationFactory stub = (IMediaReservationFactory) registry.lookup("MediaReservationFactory");

            IMediaReservation mediaReservation = stub.create();

            mediaReservation.reserve(new Media(),new Customer());

        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
        */
        launch(args);
    }


}


