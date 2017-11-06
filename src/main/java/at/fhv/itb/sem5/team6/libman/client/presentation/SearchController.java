package at.fhv.itb.sem5.team6.libman.client.presentation;

import at.fhv.itb.sem5.team6.libman.client.backend.ClientController;
import at.fhv.itb.sem5.team6.libman.shared.DTOs.immutable.ImmutableMedia;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

import java.rmi.RemoteException;
import java.util.LinkedList;
import java.util.List;

public class SearchController {
    static String host = "localhost";
    static int port = 1099;


    @FXML
    private AnchorPane anchorPane;
    @FXML
    private GridPane gridPane;
    @FXML
    private Label headerLabel;
    @FXML
    private TableView<MediaEntry> tableView;
    @FXML
    private TableColumn<?, ?> columnTitle;
    @FXML
    private TableColumn<?, ?> columnMediatype;
    @FXML
    private TableColumn<?, ?> columnAvailable;
    @FXML
    private ComboBox<?> comboMediatype;
    @FXML
    private ComboBox<?> comboGenre;
    @FXML
    private ComboBox<?> comboAvailabilty;

    @FXML
    private TextField searchTextField;

    @FXML
    public void initialize() {

        columnTitle.prefWidthProperty().bind(tableView.widthProperty().divide(2)); // w * 1/4
        columnMediatype.prefWidthProperty().bind(tableView.widthProperty().divide(4)); // w * 1/2
        columnAvailable.prefWidthProperty().bind(tableView.widthProperty().divide(4)); // w * 1/4

    }

    @FXML
    void search(ActionEvent event) throws RemoteException {
        String searchText = searchTextField.getText();
        List<ImmutableMedia> allMedia = new LinkedList<>();
        if(searchText != null) {
            allMedia = ClientController.getInstance().findAllMedia(searchText);
        } else {
            allMedia = ClientController.getInstance().findAllMedia();
        }

        for(ImmutableMedia media : allMedia) {
            tableView.getItems().add(new MediaEntry(media.getTitle(), media.getType().toString(), " mm ", media));
        }





    }


}
