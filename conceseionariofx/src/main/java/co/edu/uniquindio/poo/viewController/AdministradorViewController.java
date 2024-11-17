package co.edu.uniquindio.poo.viewController;

import java.time.LocalDate;

import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.LoginController;
import co.edu.uniquindio.poo.model.Cliente;
import co.edu.uniquindio.poo.model.Transaccion;
import co.edu.uniquindio.poo.model.Vehiculo;
import co.edu.uniquindio.poo.model.Vendedor;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class AdministradorViewController {
    @FXML
    private Button btnModificarE;

    @FXML
    private TableColumn<Cliente, String> clmTelefonoC;

    @FXML
    private TableView<Transaccion> tblReportes;

    @FXML
    private TableColumn<Vendedor, String> clmTelefonoE;

    @FXML
    private TableView<Cliente> tblClientes;

    @FXML
    private TableColumn<Transaccion, String> clmCodigoReportes;

    @FXML
    private Label lblFecha2;

    @FXML
    private Button btnAgregarE;

    @FXML
    private Button btnRegresar;

    @FXML
    private TableColumn<Transaccion, LocalDate> clmFechaReportes;

    @FXML
    private TableColumn<Cliente, String> clmDireccionC;

    @FXML
    private TableColumn<Vendedor, String> clmDireccionE;

    @FXML
    private TableColumn<Vendedor, String> clmCedulaE;

    @FXML
    private Button btnVerReportes;

    @FXML
    private TableColumn<Cliente, String> clmCorreoC;

    @FXML
    private TableColumn<Cliente, String> clmCuentaC;

    @FXML
    private Button btnBloquearE;

    @FXML
    private TableColumn<Vendedor, String> clmCorreoE;

    @FXML
    private TableColumn<Vendedor, String> clmCuentaE;

    @FXML
    private DatePicker date2;

    @FXML
    private DatePicker date1;

    @FXML
    private TableColumn<Transaccion, Integer> clmPrecioTotalReportes;

    @FXML
    private Label lblFceha1;

    @FXML
    private TableColumn<Cliente, String> clmCedulaC;

    @FXML
    private TableView<Vendedor> tblEmpleados;

    @FXML
    private TableColumn<Cliente, String> clmNombreC;

    @FXML
    private TableColumn<Vendedor, String> clmApellidoE;

    @FXML
    private TableColumn<Cliente, String> clmApellidoC;

    @FXML
    private TableColumn<Vendedor, String> clmNombreE;

    private App app;

    LoginController loginController;

    private ObservableList<Cliente> clientes;
    private ObservableList<Vendedor> vendedores;
    private ObservableList<Transaccion> transacciones;

    Vendedor selectedVendedor;

    @FXML
    void initialize() {
        loginController = new LoginController(app.concesionario);

        clientes = FXCollections.observableArrayList();
        vendedores = FXCollections.observableArrayList();
        transacciones = FXCollections.observableArrayList();

        carga();
    }

    private void carga() {
        enlaceDataCliente();
        enlaceDataVendedor();
        enlaceDataTransaccion();

        seleccionarVendedor();
    }

    private void enlaceDataCliente() {
        clmCedulaC.setCellValueFactory(new PropertyValueFactory<>("cedula"));
        clmNombreC.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        clmApellidoC.setCellValueFactory(new PropertyValueFactory<>("apellido"));
        clmTelefonoC.setCellValueFactory(new PropertyValueFactory<>("telefono"));
        clmCorreoC.setCellValueFactory(new PropertyValueFactory<>("correo"));
        clmDireccionC.setCellValueFactory(new PropertyValueFactory<>("direccion"));
        clmCuentaC.setCellValueFactory(new PropertyValueFactory<>("cuenta"));
    }

    private void enlaceDataVendedor() {
        clmCedulaE.setCellValueFactory(new PropertyValueFactory<>("cedula"));
        clmNombreE.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        clmApellidoE.setCellValueFactory(new PropertyValueFactory<>("apellido"));
        clmApellidoE.setCellValueFactory(new PropertyValueFactory<>("telefono"));
        clmCorreoE.setCellValueFactory(new PropertyValueFactory<>("correo"));
        clmDireccionE.setCellValueFactory(new PropertyValueFactory<>("direccion"));
        clmCuentaE.setCellValueFactory(new PropertyValueFactory<>("cuenta"));
    }

    private void enlaceDataTransaccion() {
        clmCodigoReportes.setCellValueFactory(new PropertyValueFactory<>("codigo"));
        clmFechaReportes.setCellValueFactory(new PropertyValueFactory<>("fecha"));
        clmPrecioTotalReportes.setCellValueFactory(new PropertyValueFactory<>("precioTotal"));
    }

    private void seleccionarVendedor() {
        tblEmpleados.getSelectionModel().selectedItemProperty().addListener((obs, oldSelection, newSelection) -> {
            selectedVendedor = newSelection;
        });
    }

    @FXML
    void agregarEmpleado(ActionEvent event) {
        app.openDatosEmpleadoView();
        
    }

    @FXML
    void bloquearCuenta(ActionEvent event) {
        
    }

    @FXML
    void modificarEmpleado(ActionEvent event) {

    }

    @FXML
    void verReportesAction(ActionEvent event) {

    }
    
    @FXML
    void regresarLogin(ActionEvent event) {

    }

    public void setApp(App app) {
        this.app = app;
    }
}