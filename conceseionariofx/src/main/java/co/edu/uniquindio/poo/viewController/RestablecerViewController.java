package co.edu.uniquindio.poo.viewController;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.RestablecerController;
import co.edu.uniquindio.poo.model.Administrador;
import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Vendedor;
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

        String usuario = app.getLoginViewController().getUsuario();

        for (Cliente cliente : restablecerController.obtenerListaClientes()) {
            if (cliente.getCuenta().equals(usuario)) {
                txtPregunta.setText(cliente.getPreguntaRecuperacion());
            }
        } for (Vendedor vendedor : restablecerController.obtenerListaVendedores()) {
            if (vendedor.getCuenta().equals(usuario)) {
                txtPregunta.setText(vendedor.getPreguntaRecuperacion());
            }
        } for (Administrador administrador : restablecerController.obtenerListaAdministradores()) {

        }
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
