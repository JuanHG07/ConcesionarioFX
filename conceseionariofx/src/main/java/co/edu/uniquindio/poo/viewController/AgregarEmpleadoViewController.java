package co.edu.uniquindio.poo.viewController;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class EmpleadoViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField apellidoField;

    @FXML
    private Button btnCancelar;

    @FXML
    private Button btnGuardarEmpleado;

    @FXML
    private Button btnLimpiarCampos;

    @FXML
    private TextField cedulaField;

    @FXML
    private TextField codigoEmpleadoField;

    @FXML
    private TextField correoField;

    @FXML
    private TextField direccionField;

    @FXML
    private TextField nombreField;

    @FXML
    private TextField telefonoField;


    @FXML
    void cancelarAction(ActionEvent event) {
    }

    @FXML
    void guardarEmpleado(ActionEvent event) {
    }

    @FXML
    void limpiarCamposAction(ActionEvent event) {
    }

    @FXML
    void initialize() {
        assert apellidoField != null : "fx:id=\"apellidoField\" was not injected: check your FXML file 'datosEmpleado.fxml'.";
        assert btnCancelar != null : "fx:id=\"btnCancelar\" was not injected: check your FXML file 'datosEmpleado.fxml'.";
        assert btnGuardarEmpleado != null : "fx:id=\"btnGuardarEmpleado\" was not injected: check your FXML file 'datosEmpleado.fxml'.";
        assert btnLimpiarCampos != null : "fx:id=\"btnLimpiarCampos\" was not injected: check your FXML file 'datosEmpleado.fxml'.";
        assert cedulaField != null : "fx:id=\"cedulaField\" was not injected: check your FXML file 'datosEmpleado.fxml'.";
        assert codigoEmpleadoField != null : "fx:id=\"codigoEmpleadoField\" was not injected: check your FXML file 'datosEmpleado.fxml'.";
        assert correoField != null : "fx:id=\"correoField\" was not injected: check your FXML file 'datosEmpleado.fxml'.";
        assert direccionField != null : "fx:id=\"direccionField\" was not injected: check your FXML file 'datosEmpleado.fxml'.";
        assert nombreField != null : "fx:id=\"nombreField\" was not injected: check your FXML file 'datosEmpleado.fxml'.";
        assert telefonoField != null : "fx:id=\"telefonoField\" was not injected: check your FXML file 'datosEmpleado.fxml'.";


    }

}