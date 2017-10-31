package at.fhv.itb.sem5.team6.libman.client.presentation;

import at.fhv.itb.sem5.team6.libman.client.ClientTest;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by Christina on 31.10.2017.
 */
public class ClientGUI {

    public void start(Stage primaryStage) throws Exception {
        loadGUI(primaryStage);
    }

    private static void loadGUI(Stage primaryStage) {

        try {
            primaryStage = new Stage();
            primaryStage.setTitle("LIBMAN");
            //primaryStage.setResizable(false);
            primaryStage.setMaximized(true);

            primaryStage.setOnCloseRequest(t -> {
                //closePlanchester();
            });

            Scene scene = new Scene(FXMLLoader.load(ClientGUI.class.getResource("MainFrame.fxml")));


            //String css = url.toExternalForm();
            //scene.getStylesheets().add(css);

            primaryStage.setScene(scene);
            // primaryStage.getIcons().add(new Image("file:src/Presentation/Images/logoplanchester.png"));
            primaryStage.show();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
