package at.fhv.itb.sem5.team6.libman.client.presentation;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;

public class SearchController {

    @FXML
    private AnchorPane anchorPane;

    @FXML
    private ScrollPane scrollPane;

    @FXML
    private GridPane gridPane;

    @FXML
    private Label headerLabel;
    @FXML
    private TableView<?> tableView;

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
    public void initialize() {
        scrollPane.setFitToHeight(true);
        scrollPane.setFitToHeight(true);
        columnTitle.prefWidthProperty().bind(tableView.widthProperty().divide(2)); // w * 1/4
        columnMediatype.prefWidthProperty().bind(tableView.widthProperty().divide(4)); // w * 1/2
        columnAvailable.prefWidthProperty().bind(tableView.widthProperty().divide(4)); // w * 1/4


    }

}
