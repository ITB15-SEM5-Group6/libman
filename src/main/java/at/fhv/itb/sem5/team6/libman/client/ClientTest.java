package at.fhv.itb.sem5.team6.libman.client;

import at.fhv.itb.sem5.team6.libman.client.presentation.ClientGUI;
import javafx.application.Application;
import javafx.stage.Stage;

import java.util.Locale;

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


