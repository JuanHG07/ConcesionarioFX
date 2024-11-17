package co.edu.uniquindio.poo.viewController;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.LoginController;
import co.edu.uniquindio.poo.model.Administrador;
import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Vendedor;
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

    private String usuario;

    @FXML
    void initialize() {
        loginController = new LoginController(app.concesionario);
    }
    
    @FXML
    void recuperarContrasenia(ActionEvent event) {

        usuario = txtUsuario.getText();

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
        iniciarSesion();
    }

    private void iniciarSesion() {
        String usuario = txtUsuario.getText();
        String contrasenia = txtContrasenia.getText();

        for (Cliente cliente : loginController.obtenerListaClientes()) {
            if (cliente.getCuenta().equals(usuario) & cliente.getContrasenia().equals(contrasenia)) {
                //app.openClienteView();
                break;
            }
        } for (Vendedor vendedor : loginController.obtenerListaVendedores()) {
            if (vendedor.getCuenta().equals(usuario) & vendedor.getContrasenia().equals(contrasenia)) {
                //app.openVendedorView();
                break;
            }
        } for (Administrador administrador : loginController.obtenerListaAdministradores()) {
            if (administrador.getCuenta().equals(usuario) & administrador.getContrasenia().equals(contrasenia)) {
                //app.openAdministradorView();
                System.out.println("xd");
                break;
            }
        }
        
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setHeaderText(null);
        alert.setTitle("ERROR");
        alert.setContentText("El usuario o contraseña no son validos.");
        alert.showAndWait();
    }

    public String getUsuario() {
        return usuario;
    }

    public void setApp(App app) {
        this.app = app;
    }
}
