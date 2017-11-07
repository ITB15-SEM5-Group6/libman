package at.fhv.itb.sem5.team6.libman.client.presentation;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by Christina on 07.11.2017.
 */
public class DetailMediaViewController {

    @FXML
    private Label titleLabel;
    @FXML
    private TableView<?> tableView;
    @FXML
    private TableColumn<?, ?> tableColumnIndex;
    @FXML
    private TableColumn<?, ?> tableColumnAvailable;
    @FXML
    private Label labelMediaType;
    @FXML
    private Label labelISBN;
    @FXML
    private Label labelAuthor;
    @FXML
    private Label labelPublisher;
    @FXML
    private Label lableReleaseDate;
    @FXML
    private Label lableTags;
    @FXML
    private Label lableGenre;
    @FXML
    private Button buttonReserve;
    @FXML
    private Button buttonLend;

    @FXML
    public void initialize() {

    }



}
