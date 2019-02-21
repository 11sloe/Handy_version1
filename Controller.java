import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextArea txtArea;

    @FXML
    private TextField txtFeld;

    @FXML
    private Button button1;

    @FXML
    private Button button2;

    @FXML
    private Button button3;

    @FXML
    void button1Handler(ActionEvent event) {
        txtArea.appendText(button1.getText()+" ");

    }

    @FXML
    void button2Handler(ActionEvent event) {
        txtArea.appendText(button2.getText()+" ");
    }

    @FXML
    void button3Handler(ActionEvent event) {
        txtArea.appendText(button3.getText()+" ");
    }

    @FXML
    void initialize() {
        assert txtArea != null : "fx:id=\"txtArea\" was not injected: check your FXML file 'view.fxml'.";
        assert txtFeld != null : "fx:id=\"txtFeld\" was not injected: check your FXML file 'view.fxml'.";
        assert button1 != null : "fx:id=\"button1\" was not injected: check your FXML file 'view.fxml'.";
        assert button2 != null : "fx:id=\"button2\" was not injected: check your FXML file 'view.fxml'.";
        assert button3 != null : "fx:id=\"button3\" was not injected: check your FXML file 'view.fxml'.";

    }

}