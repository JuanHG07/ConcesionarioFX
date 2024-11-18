package co.edu.uniquindio.poo.viewController;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.ClienteController;
import co.edu.uniquindio.poo.controller.VentaClienteController;
import co.edu.uniquindio.poo.model.Combustion;
import co.edu.uniquindio.poo.model.Moto;
import co.edu.uniquindio.poo.model.Transmision;
import co.edu.uniquindio.poo.model.Vehiculo;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
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
    private Label lblVelMax;

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
        lblNuevo.setStyle("-fx-text-fill: red;");
        lblCambios.setStyle("-fx-text-fill: red;");
        lblVelMax.setStyle("-fx-text-fill: red;");
        lblCilindraje.setStyle("-fx-text-fill: red;");

        if (radioMoto.isSelected()) {
            lblDefensas.setStyle("-fx-text-fill: red;");
        } else if (radioCamion.isSelected()) {
            lblCapacidadCarga.setStyle("-fx-text-fill: red;");
            lblAireAcondicionado.setStyle("-fx-text-fill: red;");
            // lblFrenosAire FALTA
            lblAbs.setStyle("-fx-text-fill: red;");
            lblNumeroEjes.setStyle("-fx-text-fill: red;");
        } else if (radioHibrido.isSelected()) {
            lblEnchufable.setStyle("-fx-text-fill: red;");
            lblLigero.setStyle("-fx-text-fill: red;");
        } else if (radioElectrico.isSelected()) {
            lblAutonomia.setStyle("-fx-text-fill: red;");
            lblCarga.setStyle("-fx-text-fill: red;");
        } else {
            lblNumeroPasajeros.setStyle("-fx-text-fill: red;");
            lblNumeroPuertas.setStyle("-fx-text-fill: red;");
            lblBolsasAire.setStyle("-fx-text-fill: red;");
            if (radioDeportivo.isSelected()) {
                lblCaballosFuerza.setStyle("-fx-text-fill: red;");
                lblTiempo.setStyle("-fx-text-fill: red;");
            } else {
                lblAireAcondicionado.setStyle("-fx-text-fill: red;");
                lblAbs.setStyle("-fx-text-fill: red;");
                if (radioVan.isSelected()) {
                    lblCamaraReversa.setStyle("-fx-text-fill: red;");
                    lblCapacidadMaletero.setStyle("-fx-text-fill: red;");
                } else if (radioPickUp.isSelected()) {
                    lblTraccion.setStyle("-fx-text-fill: red;");
                    lblCapacidadCarga.setStyle("-fx-text-fill: red;");
                } else {
                    //lblVelocidadCrucero FALTA
                    lblCapacidadMaletero.setStyle("-fx-text-fill: red;");
                    if (radioBus.isSelected()) {
                        lblNumeroEjes.setStyle("-fx-text-fill: red;");
                        ///lblNumeroSalidasEmergencia FALTA
                    } else {
                        lblCamaraReversa.setStyle("-fx-text-fill: red;");
                        lblSensorColision.setStyle("-fx-text-fill: red;");
                        lblSensorTraficoCruzado.setStyle("-fx-text-fill: red;");
                        lblAsistentePermanenciaCarril.setStyle("-fx-text-fill: red;");
                        if (radioSedan.isSelected()) {
                            //lblEspejosElectricos FALTA
                        } else if (radioCamioneta.isSelected()) {
                            lblTraccion.setStyle("-fx-text-fill: red;");
                        }
                    }
                }
            }
        }
    }

    @FXML
    void venderVehiculo(ActionEvent event) {
        try {
            String codigo = txtCodigo.getText();
            String marca = txtMarca.getText();
            String modelo = txtModelo.getText();
            String nuevoString = txtNuevo.getText().toLowerCase();
            String cambiosString = txtCambios.getText();
            String velMaxString = txtVelMax.getText();
            String cilindrajeString = txtCilindraje.getText();
            String defensasString = txtDefensas.getText().toLowerCase();
            String capacidadCargaString = txtCapacidadCarga.getText();
            String aireAcondicionadoString = txtAireAcondicionado.getText().toLowerCase();
            String absString = txtAbs.getText().toLowerCase();
            String numeroEjesString = txtNumeroEjes.getText();
            String numeroPasajerosString = txtNumeroPasajeros.getText();
            String numeroPuertasString = txtNumeroPuertas.getText();
            String numeroBolsasAireString = txtNumeroBolsasAire.getText();
            String caballosFuerzaString = txtCaballosFuerza.getText();
            String tiempoCeroCienString = txtTiempo0100.getText();
            String traccionString = txtTraccion.getText().toLowerCase();
            String autonomiaString = txtAutonomia.getText();
            String tiempoCargaString = txtTiempoCarga.getText();
            String enchufableString = txtEnchufable.getText().toLowerCase();
            String ligeroString = txtLigero.getText().toLowerCase();
            String tipoCombustionString = txtTipoCombustion.getText().toLowerCase();
            String tipoTransmisionString = txtTipoTransmision.getText().toLowerCase();
            String camaraReversaString = txtCamaraReversa.getText().toLowerCase();
            String capacidadMaleteroString = txtCapacidadMaletero.getText().toLowerCase();
            String sensorColisionString = txtSensorColision.getText().toLowerCase();
            String sensorTraficoCruzadoString = txtSensorTraficoCruzado.getText().toLowerCase();
            String asistentePermanenciaCarrilString = txtAsistentePermanenciaCarril.getText().toLowerCase();

            if (codigo.isEmpty() || marca.isEmpty() || modelo.isEmpty() || nuevoString.isEmpty() || cambiosString.isEmpty() || velMaxString.isEmpty() || cilindrajeString.isEmpty() || tipoTransmisionString.isEmpty() || tipoCombustionString.isEmpty()) {
                Alert alert = new Alert(Alert.AlertType.ERROR);
                alert.setHeaderText(null);
                alert.setTitle("ERROR");
                alert.setContentText("Debes rellenar los espacios: Nuevo, Cambios, Velocidad Maxima o Cilindraje.");
                alert.showAndWait();
            } else {
                boolean nuevo = nuevoString == "si" ? true : false;
                int cambios = Integer.parseInt(cambiosString);
                double velMax = Integer.parseInt(velMaxString);
                double cilindraje = Integer.parseInt(cilindrajeString);
                Transmision transmision = determinarTransmision(tipoTransmisionString);
                Combustion combustion = determinarCombustion(tipoCombustionString);
                if (radioMoto.isSelected()) {
                    if (defensasString.isEmpty()) {
                        Alert alert = new Alert(Alert.AlertType.ERROR);
                        alert.setHeaderText(null);
                        alert.setTitle("ERROR");
                        alert.setContentText("Debes rellenar los espacios: Defensas.");
                        alert.showAndWait();
                    } else {
                        boolean defensas = defensasString == "si" ? true : false;
                        Vehiculo vehiculo = new Moto(codigo, marca, modelo, nuevo, cambios, velMax, cilindraje, defensas, null, null);
                    }
                }
            }
        } catch (NumberFormatException e) {
            // TODO: handle exception
        }
    }

    private Transmision determinarTransmision(Transmision transmision) {

    }

    @FXML
    void regresarCliente(ActionEvent event) {

    }

    public void setApp(App app) {
        this.app = app;
    }

}

