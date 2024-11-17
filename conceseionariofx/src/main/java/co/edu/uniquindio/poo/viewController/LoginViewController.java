package co.edu.uniquindio.poo.viewController;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.LoginController;
import co.edu.uniquindio.poo.model.Administrador;
import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Usuario;
import co.edu.uniquindio.poo.model.Vendedor;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

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

    private String usuarioText;

    @FXML
    void initialize() {
        loginController = new LoginController(app.concesionario);
    }

    @FXML
    void ingresarAplicacion(ActionEvent event) {
        iniciarSesion();
    }

    private void iniciarSesion() {
        String usuario = txtUsuario.getText();
        String contrasenia = txtContrasenia.getText();

        for (Cliente cliente : loginController.obtenerListaClientes()) {
            if (cliente.iniciarSesion(usuario, contrasenia)) {
                // app.openClienteView();
                Stage stage = (Stage) btnIngresar.getScene().getWindow();
                stage.close();
                break;
            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setTitle("ERROR");
                alert.setContentText("El usuario o contraseña no son validos.");
                alert.showAndWait();
            }
        }
        for (Vendedor vendedor : loginController.obtenerListaVendedores()) {
            if (vendedor.iniciarSesion(usuario, contrasenia)) {
                // app.openVendedorView();
                Stage stage = (Stage) btnIngresar.getScene().getWindow();
                stage.close();
                break;
            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setTitle("ERROR");
                alert.setContentText("El usuario o contraseña no son validos.");
                alert.showAndWait();
            }
        }
        for (Administrador administrador : loginController.obtenerListaAdministradores()) {
            if (administrador.iniciarSesion(usuario, contrasenia)) {
                app.openAdministradorView();
                Stage stage = (Stage) btnIngresar.getScene().getWindow();
                stage.close();
                break;
            } else {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setTitle("ERROR");
                alert.setContentText("El usuario o contraseña no son validos.");
                alert.showAndWait();
            }
        }
    }

    @FXML
    void recuperarContrasenia(ActionEvent event) {

        usuarioText = txtUsuario.getText();

        Usuario usuario = null;

        for (Cliente cliente : loginController.obtenerListaClientes()) {
            if (cliente.getCuenta().equals(usuarioText)) {
                usuario = cliente;
            }
        }
        for (Vendedor vendedor : loginController.obtenerListaVendedores()) {
            if (vendedor.getCuenta().equals(usuarioText)) {
                usuario = vendedor;
            }
        }
        for (Administrador administrador : loginController.obtenerListaAdministradores()) {
            if (administrador.getCuenta().equals(usuarioText)) {
                usuario = administrador;
            }
        }

        if (usuarioText.isEmpty()) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("ERROR");
            alert.setContentText("Debes rellenar el usuario.");
            alert.showAndWait();

        } else if (usuario == null) {

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("ERROR");
            alert.setContentText("El usuario a recuperar es invalido.");
            alert.showAndWait();

        } else {
            app.openRestablecerView();
        }
    }

    public String getUsuario() {
        return usuarioText;
    }

    public void setApp(App app) {
        this.app = app;
    }
}
