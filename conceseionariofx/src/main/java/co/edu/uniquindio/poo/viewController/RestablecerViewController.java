package co.edu.uniquindio.poo.viewController;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.RestablecerController;
import co.edu.uniquindio.poo.model.Administrador;
import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Usuario;
import co.edu.uniquindio.poo.model.Vendedor;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class RestablecerViewController {
    @FXML
    private TextField txtContraseniaNueva;

    @FXML
    private Button btnAceptar;

    @FXML
    private Button btnRegresar;

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
    }

    @FXML
    void cargarPregunta(ActionEvent event) {
        obtenerPregunta();
    }

    private void obtenerPregunta() {

        String usuario = app.getLoginViewController().getUsuario();

        for (Cliente cliente : restablecerController.obtenerListaClientes()) {
            if (cliente.getCuenta().equals(usuario)) {
                txtPregunta.setText(cliente.getPreguntaRecuperacion());
            }
        }
        for (Vendedor vendedor : restablecerController.obtenerListaVendedores()) {
            if (vendedor.getCuenta().equals(usuario)) {
                txtPregunta.setText(vendedor.getPreguntaRecuperacion());
            }
        }
        for (Administrador administrador : restablecerController.obtenerListaAdministradores()) {
            if (administrador.getCuenta().equals(usuario)) {
                txtPregunta.setText(administrador.getPreguntaRecuperacion());
            }
        }
    }

    @FXML
    void confirmarRespuesta(ActionEvent event) {
        verificarRespuesta();
    }

    private boolean verificarRespuesta() {
        String respuesta = txtRespuesta.getText();
        boolean centinela = false;

        for (Cliente cliente : restablecerController.obtenerListaClientes()) {
            if (cliente.getRespuestaRecuperacion().equals(respuesta)) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText(null);
                alert.setTitle("INFO.");
                alert.setContentText("La respuesta es correcta. Puede ingresar la nueva contraseña.");
                alert.showAndWait();
                centinela = true;
            } else {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText(null);
                alert.setTitle("INFO.");
                alert.setContentText("La respuesta es incorrecta.");
                alert.showAndWait();
            }
        }
        for (Vendedor vendedor : restablecerController.obtenerListaVendedores()) {
            if (vendedor.getRespuestaRecuperacion().equals(respuesta)) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText(null);
                alert.setTitle("INFO.");
                alert.setContentText("La respuesta es correcta. Puede ingresar la nueva contraseña.");
                alert.showAndWait();
                centinela = true;
            } else {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText(null);
                alert.setTitle("INFO.");
                alert.setContentText("La respuesta es incorrecta.");
                alert.showAndWait();
            }
        }
        for (Administrador administrador : restablecerController.obtenerListaAdministradores()) {
            if (administrador.getRespuestaRecuperacion().equals(respuesta)) {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText(null);
                alert.setTitle("INFO.");
                alert.setContentText("La respuesta es correcta. Puede ingresar la nueva contraseña.");
                alert.showAndWait();
                centinela = true;
            } else {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setHeaderText(null);
                alert.setTitle("INFO.");
                alert.setContentText("La respuesta es incorrecta.");
                alert.showAndWait();
            }
        }
        return centinela;
    }

    @FXML
    void reestablecerContra(ActionEvent event) {

        String usuario = app.getLoginViewController().getUsuario();
        String contraseniaNueva = txtContraseniaNueva.getText();

        if (verificarRespuesta()) {
            for (Cliente cliente : restablecerController.obtenerListaClientes()) {
                if (cliente.getRespuestaRecuperacion().equals(usuario)) {
                    cliente.reestablecerContrasenia(contraseniaNueva);
                }
            }
            for (Vendedor vendedor : restablecerController.obtenerListaVendedores()) {
                if (vendedor.getRespuestaRecuperacion().equals(usuario)) {
                    vendedor.reestablecerContrasenia(contraseniaNueva);
                }
            }
            for (Administrador administrador : restablecerController.obtenerListaAdministradores()) {
                if (administrador.getRespuestaRecuperacion().equals(usuario)) {
                    administrador.reestablecerContrasenia(contraseniaNueva);
                }
            }
        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("ERROR.");
            alert.setContentText("Verifica la respuesta.");
            alert.showAndWait();
        }
    }

    @FXML
    void regresarLogin(ActionEvent event) {
        Stage stage = (Stage) btnRegresar.getScene().getWindow();
        stage.close();
    }

    public void setApp(App app) {
        this.app = app;
    }
}
