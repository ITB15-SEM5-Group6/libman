package at.fhv.itb.sem5.team6.libman.client;

import at.fhv.itb.sem5.team6.libman.client.presentation.ClientGUI;
import javafx.application.Application;
import javafx.stage.Stage;

import java.util.Locale;

public class Client extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Locale.setDefault(Locale.UK);

        ClientGUI gui = new ClientGUI();
        gui.loadGUI(primaryStage);
    }

    public static void main(String[] args) {
          launch(args);
    }


}


