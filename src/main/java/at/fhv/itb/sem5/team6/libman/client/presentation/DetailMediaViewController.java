package at.fhv.itb.sem5.team6.libman.client.presentation;

import at.fhv.itb.sem5.team6.libman.client.backend.ClientController;
import at.fhv.itb.sem5.team6.libman.server.model.PhysicalMedia;
import at.fhv.itb.sem5.team6.libman.shared.DTOs.immutable.ImmutableMedia;
import at.fhv.itb.sem5.team6.libman.shared.DTOs.immutable.ImmutablePhysicalMedia;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.rmi.RemoteException;
import java.util.List;

/**
 * Created by Christina on 07.11.2017.
 */
public class DetailMediaViewController {

    @FXML
    private Label titleLabel;
    @FXML
    private TableView<PhysicalMediaEntry> tableView;
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
    public void initialize() throws RemoteException {
        initColumns();
        ImmutableMedia media = SearchController.getCurrentSelectedMedia();
        titleLabel.setText(media.getTitle());
        labelMediaType.setText(media.getType().toString());
        labelISBN.setText(media.getIsbn());
        labelAuthor.setText(media.getAuthor());
        labelPublisher.setText(media.getPublisher());
        lableTags.setText(media.getTags());
        lableGenre.setText(media.getGenre());;
        lableReleaseDate.setText(media.getReleaseDate() != null ? media.getReleaseDate().toString() : " ");
        List<ImmutablePhysicalMedia> physicalMedia = ClientController.getInstance().getPhysicalMedia(media);
        ObservableList<PhysicalMediaEntry> mediaEntries = FXCollections.observableArrayList();
        for (ImmutablePhysicalMedia physicalMedia1 : physicalMedia) {
            mediaEntries.add(new PhysicalMediaEntry(physicalMedia1.getIndex(), physicalMedia1.getAvailability().toString()));
        }
        tableView.setItems(mediaEntries);

    }

    private void initColumns() {
        TableColumn<PhysicalMediaEntry, String> indexCol = new TableColumn("Index");
        indexCol.setCellValueFactory(new PropertyValueFactory<>("index"));
        indexCol.prefWidthProperty().bind(tableView.widthProperty().divide(2)); // w * 1/2

        TableColumn<PhysicalMediaEntry, String> availCol = new TableColumn("Availability");
        availCol.setCellValueFactory(new PropertyValueFactory<>("available"));
        availCol.prefWidthProperty().bind(tableView.widthProperty().divide(2)); // w * 1/2

        tableView.getColumns().addAll(indexCol, availCol);

    }


}