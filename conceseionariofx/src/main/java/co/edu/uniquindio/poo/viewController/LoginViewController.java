package co.edu.uniquindio.poo.viewController;

import co.edu.uniquindio.poo.App;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class LoginViewController {
    @FXML
    private RadioButton rbtnRecuperarContrasenia;

    @FXML
    private Button btnIngresar;

    @FXML
    private TextField txtContrasenia;

    @FXML
    private TextField txtUsuario;

    private App app;
    
    @FXML
    void recuperarContrasenia(ActionEvent event) {

    }

    @FXML
    void resetBtn(ActionEvent event) {

    }

    @FXML
    void ingresarAplicacion(ActionEvent event) {

    }

    public void setApp(App app) {
        this.app = app;
    }
}
