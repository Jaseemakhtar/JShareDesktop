package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable, EventHandler<ActionEvent> {
    public TextField txtIPAddress;
    public Button btnConnect;
    public Button btnSend;
    public Button btnReceive;
    public TableView tableView;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        btnConnect.setOnAction(this);
        btnReceive.setOnAction(this);
        btnSend.setOnAction(this);
        SingleRow singleRow = new SingleRow();
        singleRow.setCurrentProgress("40%");
        singleRow.setFileName("Avengers.Infinity.War.1080p.mkv");
        singleRow.setItemNumber("1");
        singleRow.setProgress(40.0);


    }

    @Override
    public void handle(ActionEvent event) {
        if(event.getSource() == btnSend)
            send();
        else if(event.getSource() == btnConnect)
            connect();
        else
            receive();
    }

    private void receive() {

    }

    private void connect() {

    }

    private void send() {

    }
}
