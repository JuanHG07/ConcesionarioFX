package co.edu.uniquindio.poo.viewController;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.AgregarEmpleadoController;
import co.edu.uniquindio.poo.controller.LoginController;
import co.edu.uniquindio.poo.model.Vendedor;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class AgregarEmpleadoViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField txtApellido;

    @FXML
    private Button btnCancelar;

    @FXML
    private Button btnGuardarEmpleado;

    @FXML
    private Button btnLimpiarCampos;

    @FXML
    private TextField txtCedula;

    @FXML
    private TextField txtCodigoEmpleado;

    @FXML
    private TextField txtCorreo;

    @FXML
    private TextField txtDireccion;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextField txtTelefono;


    @FXML
    void cancelarAction(ActionEvent event) {
    }

    

    

    private App app;
    AgregarEmpleadoController agregarEmpleadoController;
    private Vendedor empleado;


    private void setApp(App app){
        this.app=app;
    }

    @FXML
    void initialize() {
        agregarEmpleadoController= new AgregarEmpleadoController(app.concesionario);


    }

    @FXML
    void limpiarCamposAction(ActionEvent event) {
        txtNombre.clear();
        txtApellido.clear();
        txtCedula.clear();
        txtTelefono.clear();
        txtCorreo.clear();
        txtDireccion.clear();
        txtCodigoEmpleado.clear();
    }

    @FXML
    void guardarEmpleado(ActionEvent event) {
         agregarEmpleado();
    }
    private void agregarEmpleado(){
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        String cedula= txtCedula.getText();
        String telefono = txtTelefono.getText();
        String correo= txtCorreo.getText();
        String direccion = txtDireccion.getText();
        String codigoEmpleado = txtCodigoEmpleado.getText();

        if (nombre.isEmpty() || apellido.isEmpty() || cedula.isEmpty() ||
        telefono.isEmpty() || correo.isEmpty() || direccion.isEmpty() || codigoEmpleado.isEmpty()) {

        Alert alerta = new Alert(Alert.AlertType.ERROR);
        alerta.setTitle("Campos incompletos");
        alerta.setHeaderText("Todos los campos son obligatorios");
        alerta.setContentText("Por favor, rellena todos los campos antes de continuar.");
        alerta.showAndWait();
        }else{
            Vendedor aux = new Vendedor(nombre, apellido, cedula, telefono, correo, codigoEmpleado, "uq", "uq", "uq");

        }

        
    }
    
}