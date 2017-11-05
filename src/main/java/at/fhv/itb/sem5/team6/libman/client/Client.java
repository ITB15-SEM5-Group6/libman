package at.fhv.itb.sem5.team6.libman.client;


import at.fhv.itb.sem5.team6.libman.client.presentation.ClientGUI;
import javafx.application.Application;
import javafx.stage.Stage;

public class Client extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        ClientGUI gui = new ClientGUI();
        gui.loadGUI(primaryStage);

    }
}
