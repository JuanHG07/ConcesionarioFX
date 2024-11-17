package co.edu.uniquindio.poo.viewController;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class ClienteViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField apellidoField;

    @FXML
    private Button btnCancelarAction;

    @FXML
    private Button btnGuardarCliente;

    @FXML
    private Button btnLimpiarCampos;

    @FXML
    private TextField cedulaField;

    @FXML
    private TextField correoField;

    @FXML
    private TextField direccionField;

    @FXML
    private TextField nombreField;

    @FXML
    private TextField telefonoField;
    


    @FXML
    void cancelar(ActionEvent event) {
    }

    @FXML
    void guardarClienteAction(ActionEvent event) {
    }

    @FXML
    void limpiarCamposAction(ActionEvent event) {
    }

    @FXML
    void initialize() {
        assert apellidoField != null : "fx:id=\"apellidoField\" was not injected: check your FXML file 'datosCliente.fxml'.";
        assert btnCancelarAction != null : "fx:id=\"btnCancelarAction\" was not injected: check your FXML file 'datosCliente.fxml'.";
        assert btnGuardarCliente != null : "fx:id=\"btnGuardarCliente\" was not injected: check your FXML file 'datosCliente.fxml'.";
        assert btnLimpiarCampos != null : "fx:id=\"btnLimpiarCampos\" was not injected: check your FXML file 'datosCliente.fxml'.";
        assert cedulaField != null : "fx:id=\"cedulaField\" was not injected: check your FXML file 'datosCliente.fxml'.";
        assert correoField != null : "fx:id=\"correoField\" was not injected: check your FXML file 'datosCliente.fxml'.";
        assert direccionField != null : "fx:id=\"direccionField\" was not injected: check your FXML file 'datosCliente.fxml'.";
        assert nombreField != null : "fx:id=\"nombreField\" was not injected: check your FXML file 'datosCliente.fxml'.";
        assert telefonoField != null : "fx:id=\"telefonoField\" was not injected: check your FXML file 'datosCliente.fxml'.";


    }

}