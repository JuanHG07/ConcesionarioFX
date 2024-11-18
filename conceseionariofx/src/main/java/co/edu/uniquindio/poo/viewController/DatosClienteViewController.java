package co.edu.uniquindio.poo.viewController;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.DatosClienteController;
import co.edu.uniquindio.poo.controller.DatosEmpleadoController;
import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Vendedor;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class DatosClienteViewController {

    @FXML
    private TextField respuestaRecuperacionField;

    @FXML
    private TextField preguntaRecuperacionField;

    @FXML
    private TextField direccionField;

    @FXML
    private TextField nombreField;

    @FXML
    private TextField apellidoField;

    @FXML
    private TextField cedulaField;

    @FXML
    private TextField telefonoField;

    @FXML
    private TextField cuentaField;

    @FXML
    private TextField correoField;

    @FXML
    private PasswordField contrasenaField;

    @FXML
    private Button btnGuardarCliente;

    @FXML
    private Button btnCancelarAction;

    @FXML
    private Button btnLimpiarCampos;

    @FXML
    void limpiarCamposAction(ActionEvent event) {

    }

    @FXML
    void cancelar(ActionEvent event) {

    }

    private App app;

    DatosClienteController datosClienteController;
    
    private Cliente cliente;

    @FXML

    void initialize() {
        datosClienteController = new DatosClienteController(app.concesionario);
        limpiarEspacios();
    }

    @FXML
    void limpiarCampos(ActionEvent event) {
        limpiarEspacios();
    }

    private void limpiarEspacios() {
        nombreField.clear();
        apellidoField.clear();
        cedulaField.clear();
        telefonoField.clear();
        correoField.clear();
        direccionField.clear();
        contrasenaField.clear();
        cuentaField.clear();
        preguntaRecuperacionField.clear();
        respuestaRecuperacionField.clear();
    }

    @FXML
    void guardarClienteAction(ActionEvent event) {
        agregarCliente();
    }

    private void agregarCliente() {
        String nombre = nombreField.getText();
        String apellido = apellidoField.getText();
        String cedula = cedulaField.getText();
        String telefono = telefonoField.getText();
        String correo = correoField.getText();
        String direccion = direccionField.getText();
        String contrasena = contrasenaField.getText();
        String cuenta = cuentaField.getText();
        String preguntaRecuperacion = preguntaRecuperacionField.getText();
        String respuestaRecuperacion = respuestaRecuperacionField.getText();

        if (nombre.isEmpty() || apellido.isEmpty() || cedula.isEmpty() ||
                telefono.isEmpty() || correo.isEmpty() || direccion.isEmpty() || contrasena.isEmpty()
                || cuenta.isEmpty() || preguntaRecuperacion.isEmpty()
                || respuestaRecuperacion.isEmpty()) {

            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Campos incompletos");
            alerta.setHeaderText("Todos los campos son obligatorios");
            alerta.setContentText("Por favor, rellena todos los campos antes de continuar.");
            alerta.showAndWait();
        } else {
            Cliente aux = new Cliente(nombre, apellido, cedula, telefono, correo, direccion, cuenta, contrasena,
                    preguntaRecuperacion, respuestaRecuperacion);
            if (datosClienteController.recuperarCliente(cedula) != null) {
                Alert alerta = new Alert(Alert.AlertType.ERROR);
                alerta.setTitle("Usuario invalido");
                alerta.setHeaderText("");
                alerta.setContentText("El cliente ya existe");
                alerta.showAndWait();
            } else {

                datosClienteController.agregarCliente(aux);
                Alert alerta = new Alert(Alert.AlertType.INFORMATION);
                alerta.setTitle("Usuario creado");
                alerta.setHeaderText("");
                alerta.setContentText("El cliente se ha creado con exito");
                alerta.showAndWait();
            }
        }
    }

    @FXML
    void cancelarAction(ActionEvent event) {
        //app.openVendedorView();
        Stage stage = (Stage) btnCancelarAction.getScene().getWindow();
        stage.close();
    }

    public void setApp(App app) {
        this.app = app;
    }

}
