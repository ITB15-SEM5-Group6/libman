package at.fhv.itb.sem5.team6.libman.client.presentation;

import at.fhv.itb.sem5.team6.libman.client.ClientTest;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by Christina on 31.10.2017.
 */
public class ClientGUI {

    public  Scene scene;
    public  Stage primaryStage;

    public void start(Stage primaryStage) throws Exception {
        loadGUI(primaryStage);
    }

    public void loadGUI(Stage primaryStage) {

        try {
            primaryStage = new Stage();
            primaryStage.setTitle("LIBMAN");
            //primaryStage.setResizable(false);
            primaryStage.setMaximized(true);

            primaryStage.setOnCloseRequest(t -> {
                closeLibman();
            });
            FXMLLoader fxmlLoader = new FXMLLoader(ClientGUI.class.getClassLoader().getResource("views\\MainFrame.fxml"));
            Parent root = fxmlLoader.load();
            scene = new Scene(root);

            primaryStage.setScene(scene);
            // primaryStage.getIcons().add(new Image("file:src/Presentation/Images/logoplanchester.png"));
            primaryStage.show();
            this.primaryStage = primaryStage;
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

    private static void closeLibman() {
        Platform.exit();
        System.exit(0);
    }

    public void showLogin(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getClassLoader().getResource("views\\Login.fxml"));
        Parent root = fxmlLoader.load();
        primaryStage.setTitle("LIBMAN Login");
        scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
        this.primaryStage = primaryStage;
    }
}
