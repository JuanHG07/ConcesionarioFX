package co.edu.uniquindio.poo.viewController;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.RestablecerController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class RestablecerViewController {
    @FXML
    private TextField txtContraseniaNueva;

    @FXML
    private Button btnAceptar;

    @FXML
    private TextField txtRespuesta;

    @FXML
    private Button btnVerificar;

    @FXML
    private TextField txtPregunta;

    private App app;

    RestablecerController restablecerController;

    @FXML
    void initialize() {
        restablecerController = new RestablecerController(app.concesionario);
        obtenerPregunta();
    }

    private void obtenerPregunta() {

    }

    @FXML
    void confirmarRespuesta(ActionEvent event) {

    }

    @FXML
    void regresarLogin(ActionEvent event) {

    }

    public void setApp(App app) {
        this.app = app;
    }
}
