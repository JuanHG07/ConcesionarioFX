package co.edu.uniquindio.poo.viewController;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.LoginController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
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

    LoginController loginController;

    @FXML
    void initialize() {
        loginController = new LoginController(app.concesionario);
    }
    
    @FXML
    void recuperarContrasenia(ActionEvent event) {

        String usuario = txtUsuario.getText();

        if (usuario.isEmpty()) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("ERROR");
            alert.setContentText("Debes rellenar el usuario.");
            alert.showAndWait();

        } else {
            app.openRestablecerView();
        }
    }

    @FXML
    void ingresarAplicacion(ActionEvent event) {
        if (iniciarSesion()) {
            
        }
    }

    private boolean iniciarSesion() {

    }
    
    public void setApp(App app) {
        this.app = app;
    }
}
