package co.edu.uniquindio.poo.viewController;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.ClienteController;
import co.edu.uniquindio.poo.controller.VentaClienteController;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;

public class VentaClienteViewController {
    @FXML
    private Label lblCambios;

    @FXML
    private TextField txtSensorTraficoCruzado;

    @FXML
    private RadioButton radioVan;

    @FXML
    private Label lblEnchufable;

    @FXML
    private Label lblTipoCombustion;

    @FXML
    private RadioButton radioMoto;

    @FXML
    private Label lblAireAcondicionado;

    @FXML
    private TextField txtTipoCombustion;

    @FXML
    private Label lblSensorTraficoCruzado;

    @FXML
    private TextField txtNumeroPasajeros;

    @FXML
    private TextField txtTiempoCarga;

    @FXML
    private Label lblCamaraReversa;

    @FXML
    private TextField txtAbs;

    @FXML
    private TextField txtLigero;

    @FXML
    private TextField txtNumeroBolsasAire;

    @FXML
    private Button btnVender;

    @FXML
    private RadioButton radioBus;

    @FXML
    private RadioButton radioHibrido;

    @FXML
    private TextField txtCodigo;

    @FXML
    private Label lblNumeroPuertas;

    @FXML
    private Label lblTraccion;

    @FXML
    private Label lblLigero;

    @FXML
    private Label lblCapacidadMaletero;

    @FXML
    private TextField txtNumeroEjes;

    @FXML
    private TextField txtAsistentePermanenciaCarril;

    @FXML
    private Label lblAutonomia;

    @FXML
    private Label lblAbs;

    @FXML
    private Label lblCilindraje;

    @FXML
    private TextField txtCamaraReversa;

    @FXML
    private RadioButton radioCamion;

    @FXML
    private Label lblNumeroEjes;

    @FXML
    private TextField txtDefensas;

    @FXML
    private TextField txtSensorColision;

    @FXML
    private Label lblNumeroPasajeros;

    @FXML
    private TextField txtAutonomia;

    @FXML
    private TextField txtCaballosFuerza;

    @FXML
    private TextField txtNumeroPuertas;

    @FXML
    private Label lblTipoTransmision;

    @FXML
    private TextField txtEnchufable;

    @FXML
    private Label lblNuevo;

    @FXML
    private TextField txtNuevo;

    @FXML
    private TextField txtAireAcondicionado;

    @FXML
    private Label lblCarga;

    @FXML
    private Label lblBolsasAire;

    @FXML
    private TextField txtTraccion;

    @FXML
    private Label lblSensorColision;

    @FXML
    private GridPane gridVehiculo;

    @FXML
    private Label lblDefensas;

    @FXML
    private TextField txtModelo;

    @FXML
    private Label lblVelocidad;

    @FXML
    private Label lblAsistentePermanenciaCarril;

    @FXML
    private RadioButton radioCamioneta;

    @FXML
    private TextField txtCapacidadCarga;

    @FXML
    private TextField txtTipoTransmision;

    @FXML
    private VBox vboxTipoVehiculo;

    @FXML
    private Button btnSalir;

    @FXML
    private Label lblCaballosFuerza;

    @FXML
    private TextField txtTiempo0100;

    @FXML
    private TextField txtCambios;

    @FXML
    private TextField txtVelMax;

    @FXML
    private Label lblTiempo;

    @FXML
    private RadioButton radioSedan;

    @FXML
    private RadioButton radioElectrico;

    @FXML
    private RadioButton radioPickUp;

    @FXML
    private TextField txtCapacidadMaletero;

    @FXML
    private TextField txtCilindraje;

    @FXML
    private TextField txtMarca;

    @FXML
    private RadioButton radioDeportivo;

    @FXML
    private Label lblCapacidadCarga;

    private App app;

    VentaClienteController ventaClienteController;

    void initialize() {
        ventaClienteController = new VentaClienteController(app.concesionario);
    }

    @FXML
    void seleccionarVehiculo(ActionEvent event) {

    }

    @FXML
    void venderVehiculo(ActionEvent event) {

    }

    @FXML
    void regresarCliente(ActionEvent event) {

    }

    public void setApp(App app) {
        this.app = app;
    }

}
