package co.edu.uniquindio.poo.viewController;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.AdministradorController;
import co.edu.uniquindio.poo.controller.ConsultaTransaccionController;
import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Transaccion;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class ConsultaTransaccionViewController {
    @FXML
    private RadioButton radioCompra;

    @FXML
    private Button btnCargar;

    @FXML
    private TextField txtNombreCliente;

    @FXML
    private RadioButton radioAlquiler;

    @FXML
    private RadioButton radioVenta;

    @FXML
    private Button btnEnviarOferta;

    @FXML
    private TextField txtCedulaCliente;

    @FXML
    private TextField txtApellidoCliente;

    @FXML
    private TextField txtOferta;

    private App app;

    ConsultaTransaccionController consultaTransaccionController;

    ToggleGroup toggleGroup;

    @FXML
    void initialize() {
        consultaTransaccionController = new ConsultaTransaccionController(app.concesionario);

        toggleGroup = new ToggleGroup();

        corregirOpciones();
    }

    private void corregirOpciones() {
        radioAlquiler.setToggleGroup(toggleGroup);
        radioCompra.setToggleGroup(toggleGroup);
        radioVenta.setToggleGroup(toggleGroup);
    }

    @FXML
    void enviarOferta(ActionEvent event) {
        
    }

    @FXML
    void cargarDatos(ActionEvent event) {
        Transaccion transaccion = app.getEmpleadoViewController().getSelectedTransaccion();
        Cliente cliente = transaccion.getCliente();
        txtNombreCliente.setText(cliente.getNombre());
        txtApellidoCliente.setText(cliente.getApellido());
        txtCedulaCliente.setText(cliente.getCedula());
        
    }

    public void setApp(App app) {
        this.app = app;
    }

}
