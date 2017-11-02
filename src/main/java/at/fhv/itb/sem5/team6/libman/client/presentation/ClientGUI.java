package at.fhv.itb.sem5.team6.libman.client.presentation;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by Christina on 31.10.2017.
 */
public class ClientGUI {

    public static Scene scene;
    public static Stage primaryStage;

    public void start(Stage primaryStage) throws Exception {
        showFirstLogin(primaryStage);
    }

    public void showFirstLogin(Stage primaryStage) throws Exception {
        primaryStage.setTitle("LIBMAN Login");

        scene = new Scene(FXMLLoader.load(ClientGUI.class.getResource("Login.fxml")));
        primaryStage.setScene(scene);
        //primaryStage.getIcons().add(new Image("file:src/Presentation/Images/logoplanchester.png"));
        primaryStage.show();
        //checkLogin(primaryStage);
        this.primaryStage = primaryStage;
    }

    public void loadGUI(Stage primaryStage) throws IOException{

            primaryStage.setTitle("LIBMAN");
            //primaryStage.setResizable(false);
            primaryStage.setMaximized(true);


            primaryStage.setOnCloseRequest(t -> {
                //closePlanchester();
            });

            primaryStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("MainFrame.fxml"))));
            // primaryStage.getIcons().add(new Image("file:src/Presentation/Images/logoplanchester.png"));
            primaryStage.show();

    }
}
