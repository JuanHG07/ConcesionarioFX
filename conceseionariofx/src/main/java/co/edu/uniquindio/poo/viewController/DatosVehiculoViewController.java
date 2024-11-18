package co.edu.uniquindio.poo.viewController;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import co.edu.uniquindio.poo.App;
import co.edu.uniquindio.poo.controller.DatosVehiculoController;
import co.edu.uniquindio.poo.controller.LoginController;
import co.edu.uniquindio.poo.model.Bus;
import co.edu.uniquindio.poo.model.Camion;
import co.edu.uniquindio.poo.model.Camioneta;
import co.edu.uniquindio.poo.model.Combustion;
import co.edu.uniquindio.poo.model.Deportivo;
import co.edu.uniquindio.poo.model.Moto;
import co.edu.uniquindio.poo.model.PickUp;
import co.edu.uniquindio.poo.model.Sedan;
import co.edu.uniquindio.poo.model.TipoCamion;
import co.edu.uniquindio.poo.model.Transmision;
import co.edu.uniquindio.poo.model.Van;
import co.edu.uniquindio.poo.model.Vehiculo;
import co.edu.uniquindio.poo.model.VehiculoElectrico;
import co.edu.uniquindio.poo.model.VehiculoHibrido;
import javafx.event.ActionEvent;

public class DatosVehiculoViewController {

    @FXML
    private TextField txtCapacidadMaleteroCamioneta;

    @FXML
    private TextField txtNumeroBolsasAirePickUp;

    @FXML
    private TextField txtAireAcondicionadoPickUp;

    @FXML
    private RadioButton radioVan;

    @FXML
    private RadioButton radioMoto;

    @FXML
    private TextField txtNumeroBolsasAireDeportivo;

    @FXML
    private TextField txtAireAcondicionadoVan;

    @FXML
    private TextField txtCamaraReversaVan;

    @FXML
    private TextField txtNumeroBolsasAireCamioneta;

    @FXML
    private TextField txtSensorTraficoCruzadoSedan;

    @FXML
    private TextField txtEnchufableHibrido;

    @FXML
    private TextField txtAutonomiaElectrico;

    @FXML
    private TextField txtNumeroBolsasAireSedan;

    @FXML
    private TextField txtNumeroPasajerosPickUp;

    @FXML
    private RadioButton radioDiesel;

    @FXML
    private RadioButton radioManual;

    @FXML
    private RadioButton radioHibrido;

    @FXML
    private TextField txtNumeroPuertasPickUp;

    @FXML
    private TextField txtNumeroPasajerosBus;

    @FXML
    private TextField txtNumeroPasajerosCamioneta;

    @FXML
    private TextField txtSensorColisionCamioneta;

    @FXML
    private TextField txtCapacidadCargaPickUp;

    @FXML
    private TextField txtCaballosFuerzaDeportivo;

    @FXML
    private TextField txtNumeroPuertasSedan;

    @FXML
    private TextField txtVelocidadCruceroCamioneta;

    @FXML
    private TextField txtCapacidadMaleteroVan;

    @FXML
    private TextField txtNumeroPuertasCamioneta;

    @FXML
    private TextField txtVelocidadCruceroBus;

    @FXML
    private TextField txtNuevo;

    @FXML
    private TextField txtAireAcondicionadoCamion;

    @FXML
    private Label labelHibrido;

    @FXML
    private TextField txtTraccionPickUp;

    @FXML
    private TextField txtNumeroBolsasAireBus;

    @FXML
    private TextField txtAbsBus;

    @FXML
    private TextField txtAbsSedan;

    @FXML
    private Label labelElectrico;

    @FXML
    private TextField txtModelo;

    @FXML
    private TextField txtAireAcondicionadoSedan;

    @FXML
    private RadioButton radioCamioneta;

    @FXML
    private TextField txtAbsPickUp;

    @FXML
    private TextField txtLigeroHibrido;

    @FXML
    private VBox vboxTipoVehiculo;

    @FXML
    private TextField txtSensorColisionSedan;

    @FXML
    private Button btnSalir;

    @FXML
    private Label labelMoto;

    @FXML
    private TextField txtAbsCamioneta;

    @FXML
    private TextField txtCambios;

    @FXML
    private TextField txtVelMax;

    @FXML
    private Button btnGuardar;

    @FXML
    private RadioButton radioElectrico;

    @FXML
    private Button btnEliminar;

    @FXML
    private RadioButton radioPickUp;

    @FXML
    private TextField txtVelocidadCruceroSedan;

    @FXML
    private TextField txtCapacidadMaleteroSedan;

    @FXML
    private TextField txtCilindraje;

    @FXML
    private TextField txtNumeroPuertasBus;

    @FXML
    private RadioButton radioDeportivo;

    @FXML
    private TextField txtAbsCamion;

    @FXML
    private TextField txtAbsVan;

    @FXML
    private TextField txtNumeroPasajerosVan;

    @FXML
    private TextField txtTiempoCargaElectrico;

    @FXML
    private Label labelSedan;

    @FXML
    private TextField txtNumeroPuertasVan;

    @FXML
    private TextField txtNumeroEjesBus;

    @FXML
    private TextField txtCamaraReversaSedan;

    @FXML
    private RadioButton radioSinCombustion;

    @FXML
    private Label labelDeportivo;

    @FXML
    private TextField txtNumeroPuertasDeportivo;

    @FXML
    private RadioButton radioBus;

    @FXML
    private Label labelCamioneta;

    @FXML
    private TextField txtCodigo;

    @FXML
    private Label labelCamion;

    @FXML
    private TextField txtAireAcondicionadoBus;

    @FXML
    private RadioButton radioAutomatico;

    @FXML
    private TextField txtNumeroEjes;

    @FXML
    private Label labelVan;

    @FXML
    private TextField txtNumeroBolsasAireVan;

    @FXML
    private Button btnBuscar;

    @FXML
    private RadioButton radioCamion;

    @FXML
    private TextField txtDefensas;

    @FXML
    private TextField txtTraccionCamioneta;

    @FXML
    private RadioButton radioGasolina;

    @FXML
    private TextField txtNumeroPasajerosSedan;

    @FXML
    private TextField txtAsistentePermanenciaCarrilSedan;

    @FXML
    private TextField txtAsistentePermanenciaCarrilCamioneta;

    @FXML
    private Label labelPickIp;

    @FXML
    private TextField txtAireAcondicionadoCamioneta;

    @FXML
    private TextField txtTiempoCeroCienDeportivo;

    @FXML
    private TextField txtFrenosAire;

    @FXML
    private TextField txtCamaraReversaCamioneta;

    @FXML
    private TextField txtEspejosElectricosSedan;

    @FXML
    private TextField txtNumeroPasajerosDeportivo;

    @FXML
    private Label labelBus;

    @FXML
    private TextField txtCapacidadMaleteroBus;

    @FXML
    private Button btnActualizar;

    @FXML
    private TextField txtNumeroSalidasEmergenciaBus;

    @FXML
    private Button btnLimpiar;

    @FXML
    private TextField txtCapacidadCargaCamion;

    @FXML
    private RadioButton radioSedan;

    @FXML
    private TextField txtMarca;

    @FXML
    private TextField txtSensorTraficoCruzadoCamioneta;

    @FXML
    private RadioButton radioLigero;

    @FXML
    private RadioButton radioMediano;

    @FXML
    private RadioButton radioPesado;

    private App app;
    DatosVehiculoController datosVehiculoController;
    private ToggleGroup tipoVehiculoGroup;
    private ToggleGroup tipoCombustionGroup;
    private ToggleGroup tipoTransmisionGroup;
    private ToggleGroup tipoCamionGroup;

    @FXML
    void initialize() {
        datosVehiculoController = new DatosVehiculoController(app.concesionario);
        tipoVehiculoGroup = new ToggleGroup();
        tipoCombustionGroup = new ToggleGroup();
        tipoTransmisionGroup = new ToggleGroup();
        tipoCamionGroup = new ToggleGroup();
        agruparTipoVehiculoBtn();
        agruparTipoCombustionBtn();
        agruparTipoTransmisionBtn();
        agruparTipoCamionBtn();

    }

    private void agruparTipoCamionBtn() {
        radioLigero.setToggleGroup(tipoCamionGroup);
        radioMediano.setToggleGroup(tipoCamionGroup);
        radioPesado.setToggleGroup(tipoCamionGroup);
    }

    private void agruparTipoCombustionBtn() {
        radioGasolina.setToggleGroup(tipoCombustionGroup);
        radioDiesel.setToggleGroup(tipoCombustionGroup);
        radioSinCombustion.setToggleGroup(tipoCombustionGroup);
    }

    private void agruparTipoTransmisionBtn() {
        radioAutomatico.setToggleGroup(tipoTransmisionGroup);
        radioManual.setToggleGroup(tipoTransmisionGroup);
    }

    private void agruparTipoVehiculoBtn() {
        radioMoto.setToggleGroup(tipoVehiculoGroup);
        radioCamion.setToggleGroup(tipoVehiculoGroup);
        radioBus.setToggleGroup(tipoVehiculoGroup);
        radioVan.setToggleGroup(tipoVehiculoGroup);
        radioPickUp.setToggleGroup(tipoVehiculoGroup);
        radioDeportivo.setToggleGroup(tipoVehiculoGroup);
        radioCamioneta.setToggleGroup(tipoVehiculoGroup);
        radioSedan.setToggleGroup(tipoVehiculoGroup);
        radioElectrico.setToggleGroup(tipoVehiculoGroup);
        radioHibrido.setToggleGroup(tipoVehiculoGroup);

    }

    @FXML
    void determinarVehiculo(ActionEvent event) {
        if (radioMoto.isSelected()) {
            labelMoto.setStyle("-fx-text-fill: red;");
        } else if (radioCamion.isSelected()) {
            labelCamioneta.setStyle("-fx-text-fill: red;");
        } else if (radioBus.isSelected()) {
            labelBus.setStyle("-fx-text-fill: red;");
        } else if (radioVan.isSelected()) {
            labelVan.setStyle("-fx-text-fill: red;");
        } else if (radioPickUp.isSelected()) {
            labelPickIp.setStyle("-fx-text-fill: red;");
        } else if (radioDeportivo.isSelected()) {
            labelDeportivo.setStyle("-fx-text-fill: red;");
        } else if (radioSedan.isSelected()) {
            labelSedan.setStyle("-fx-text-fill: red;");
        } else if (radioElectrico.isSelected()) {
            labelElectrico.setStyle("-fx-text-fill: red;");
        } else if (radioHibrido.isSelected()) {
            labelHibrido.setStyle("-fx-text-fill: red;");
        }
    }

    @FXML
    void determinarCombustion(ActionEvent event) {
        if (radioGasolina.isSelected()) {
            datosVehiculoController.setCombustion(Combustion.GASOLINA);
        } else if (radioDiesel.isSelected()) {
            datosVehiculoController.setCombustion(Combustion.DIESEL);
        } else if (radioSinCombustion.isSelected()) {
            datosVehiculoController.setCombustion(Combustion.SINCOMBUSTION);
        } else {
            Alert alerta = new Alert(Alert.AlertType.WARNING);
            alerta.setTitle("Seleccionar Combustión");
            alerta.setHeaderText("No se ha seleccionado un tipo de combustión");
            alerta.setContentText("Por favor, seleccione una opción válida.");
            alerta.showAndWait();
        }
    }

    @FXML
    void determinarTransmision(ActionEvent event) {
        if (radioAutomatico.isSelected()) {
            datosVehiculoController.setTransmision(Transmision.AUTOMATICO);
        } else if (radioManual.isSelected()) {
            datosVehiculoController.setTransmision(Transmision.MANUAL);
        } else {
            Alert alerta = new Alert(Alert.AlertType.WARNING);
            alerta.setTitle("Seleccionar Transmision");
            alerta.setHeaderText("No se ha seleccionado un tipo de transmision");
            alerta.setContentText("Por favor, seleccione una opción válida.");
            alerta.showAndWait();
        }

    }

    @FXML
    void determinarCamion(ActionEvent event) {
        if (radioLigero.isSelected()) {
            datosVehiculoController.setTipoCamion(TipoCamion.LIGERO);
        } else if (radioMediano.isSelected()) {
            datosVehiculoController.setTipoCamion(TipoCamion.MEDIANO);
        } else if (radioPesado.isSelected()) {
            datosVehiculoController.setTipoCamion(TipoCamion.PESADO);
        }

    }

    @FXML
    void btnGuardarAction(ActionEvent event) {
        String codigo = txtCodigo.getText();
        String marca = txtMarca.getText();
        String modelo = txtModelo.getText();
        String nuevoAux = txtNuevo.getText().toLowerCase();
        boolean nuevo = nuevoAux.equals("si");
        int cambios = ingresarEntero(txtCambios, "Cambios");
        double velMax = ingresarDouble(txtVelMax, "Velocidad Máxima");
        double cilindraje = ingresarDouble(txtCilindraje, "Cilindraje");

        if (codigo.isEmpty() || marca.isEmpty() || modelo.isEmpty() || nuevoAux.isEmpty()) {
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Campos incompletos");
            alerta.setHeaderText("Todos los campos son obligatorios");
            alerta.setContentText("Por favor, rellena todos los campos antes de continuar.");
            alerta.showAndWait();
        } else if (cambios <= 0 || velMax <= 0 || cilindraje <= 0) {
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Datos Erróneos");
            alerta.setHeaderText("Cambios, Velocidad Máxima o Cilindraje son erróneos.");
            alerta.setContentText("No pueden haber datos numéricos menores o iguales a 0.");
            alerta.showAndWait();
        } else {
            determinarCombustion(event);
            Combustion combustion = datosVehiculoController.getCombustion();
            determinarTransmision(event);
            Transmision transmision = datosVehiculoController.getTransmision();

            try {
                Vehiculo auxVehiculo = null;
                if (radioMoto.isSelected()) {
                    boolean defensas = ingresarBooleano(txtDefensas, "Defensas Moto");
                    auxVehiculo = new Moto(codigo, marca, modelo, nuevo, cambios, velMax, cilindraje, defensas,
                            combustion,
                            transmision);
                } else if (radioCamion.isSelected()) {

                    double capacidadCarga = ingresarDouble(txtCapacidadCargaCamion, "Capacidad de Carga");
                    int numEjes = ingresarEntero(txtNumeroEjes, "Número de Ejes");
                    boolean aireAcondicionado = ingresarBooleano(txtAireAcondicionadoCamion,
                            "Aire Acondicionado Camion");
                    boolean abs = ingresarBooleano(txtAbsCamion, "ABS Camion");
                    boolean frenosAire = ingresarBooleano(txtFrenosAire, "Frenos Aire Camion");

                    determinarCamion(event);

                    TipoCamion tipoCamion = datosVehiculoController.getTipoCamion();
                    auxVehiculo = new Camion(codigo, marca, modelo, nuevo, cambios, velMax, cilindraje, capacidadCarga,
                            aireAcondicionado, frenosAire, abs, numEjes, tipoCamion, combustion,
                            transmision);

                } else if (radioBus.isSelected()) {

                    int numPasajeros = ingresarEntero(txtNumeroPasajerosBus, "Número de Pasajeros");
                    int numPuertas = ingresarEntero(txtNumeroPuertasBus, "Numero de Puertas");
                    int numBolsaAire = ingresarEntero(txtNumeroBolsasAireBus, "Numero de Bolsas de Aire");
                    boolean aireAcondicionado = ingresarBooleano(txtAireAcondicionadoBus, "Aire Acondicionado Bus");
                    boolean abs = ingresarBooleano(txtAbsBus, "ABS Bus");
                    boolean velocidadCruceroBus = ingresarBooleano(txtVelocidadCruceroBus, "Velocidad Crucero Bus");
                    double capacidadMaletero = ingresarDouble(txtCapacidadMaleteroBus, "Cpacidad Maletero Bus");
                    int numeroSalidasEmergencia = ingresarEntero(txtNumeroSalidasEmergenciaBus,
                            "Numero Salidas de Emergencia");
                    int numEjes = ingresarEntero(txtNumeroEjesBus, "Número de Ejes");
                    auxVehiculo = new Bus(codigo, marca, modelo, nuevo, cambios, velMax, cilindraje, numPasajeros,
                            numPuertas, numBolsaAire, combustion, transmision, aireAcondicionado, abs,
                            velocidadCruceroBus, capacidadMaletero, numEjes, numeroSalidasEmergencia);

                } else if (radioVan.isSelected()) {

                    int numPasajeros = ingresarEntero(txtNumeroPasajerosVan, "Número de Pasajeros");
                    int numPuertas = ingresarEntero(txtNumeroPuertasVan, "Numero de Puertas");
                    int numBolsaAire = ingresarEntero(txtNumeroBolsasAireVan, "Numero de Bolsas de Aire");
                    boolean aireAcondicionado = ingresarBooleano(txtAireAcondicionadoVan, "Aire Acondicionado");
                    boolean abs = ingresarBooleano(txtAbsVan, "ABS");
                    boolean camaraReversaVan = ingresarBooleano(txtCamaraReversaVan, "Camara de Reversa");
                    double capacidadMaletero = ingresarDouble(txtCapacidadMaleteroVan, "Capacidad Maletero");

                    auxVehiculo = new Van(codigo, marca, modelo, nuevo, cambios, velMax, cilindraje, numPasajeros,
                            numPuertas, numBolsaAire, combustion, transmision, aireAcondicionado, abs, camaraReversaVan,
                            capacidadMaletero);

                } else if (radioPickUp.isSelected()) {
                    int numPasajeros = ingresarEntero(txtNumeroPasajerosPickUp, "Número de Pasajeros");
                    int numPuertas = ingresarEntero(txtNumeroPuertasPickUp, "Numero de Puertas");
                    int numBolsaAire = ingresarEntero(txtNumeroBolsasAirePickUp, "Numero de Bolsas de Aire");
                    boolean aireAcondicionado = ingresarBooleano(txtAireAcondicionadoPickUp, "Aire Acondicionado");
                    boolean abs = ingresarBooleano(txtAbsPickUp, "ABS");
                    boolean traccion = ingresarBooleano(txtTraccionPickUp, "Tracción");
                    double capacidadCarga = ingresarDouble(txtCapacidadCargaPickUp, "Capacidad de Carga");

                    auxVehiculo = new PickUp(codigo, marca, modelo, nuevo, cambios, velMax, cilindraje, numPasajeros,
                            numPuertas, numBolsaAire, combustion, transmision, aireAcondicionado, abs, traccion,
                            capacidadCarga);

                } else if (radioDeportivo.isSelected()) {
                    int numPasajeros = ingresarEntero(txtNumeroPasajerosDeportivo, "Número de Pasajeros");
                    int numPuertas = ingresarEntero(txtNumeroPuertasDeportivo, "Numero de Puertas");
                    int numBolsaAire = ingresarEntero(txtNumeroBolsasAireDeportivo, "Numero de Bolsas de Aire");
                    int caballosFuerza = ingresarEntero(txtCaballosFuerzaDeportivo, "Caballos de Fuerza");
                    double tiempoCeroCien = ingresarDouble(txtTiempoCeroCienDeportivo, "Tiempo de 0 a 100");

                    auxVehiculo = new Deportivo(codigo, marca, modelo, nuevo, cambios, velMax, cilindraje, numPasajeros,
                            numPuertas, numBolsaAire, combustion, transmision, caballosFuerza, tiempoCeroCien);

                } else if (radioSedan.isSelected()) {

                    int numPasajeros = ingresarEntero(txtNumeroPasajerosSedan, "Número de Pasajeros");
                    int numPuertas = ingresarEntero(txtNumeroPuertasSedan, "Numero de Puertas");
                    int numBolsaAire = ingresarEntero(txtNumeroBolsasAireSedan, "Numero de Bolsas de Aire");
                    boolean aireAcondicionado = ingresarBooleano(txtAireAcondicionadoSedan, "Aire Acondicionado");
                    boolean abs = ingresarBooleano(txtAbsSedan, "ABS");
                    boolean velocidadCrucero = ingresarBooleano(txtVelocidadCruceroSedan, "Velocidad Crucero");
                    double capacidadMaletero = ingresarDouble(txtCapacidadMaleteroSedan, "Capacidad Maletero");
                    boolean camaraReversa = ingresarBooleano(txtCamaraReversaSedan, "Camara de Reversa");
                    boolean sensorColicion = ingresarBooleano(txtSensorColisionSedan, "Sensor de Colicion");
                    boolean sensorTraficoCruzado = ingresarBooleano(txtSensorTraficoCruzadoSedan,
                            "Sensor de Trafico Cruzado");
                    boolean asistentePermanenciaCarril = ingresarBooleano(txtAsistentePermanenciaCarrilSedan,
                            "Asistente de Permanencia en el Carril");
                    boolean espejosElectricos = ingresarBooleano(txtEspejosElectricosSedan, "Espejos Electricos");

                    auxVehiculo = new Sedan(codigo, marca, modelo, nuevo, cambios, velMax, cilindraje, numPasajeros,
                            numPuertas, numBolsaAire, combustion, transmision, aireAcondicionado, abs, velocidadCrucero,
                            capacidadMaletero, camaraReversa, sensorColicion, sensorTraficoCruzado,
                            asistentePermanenciaCarril, espejosElectricos);

                } else if (radioCamioneta.isSelected()) {

                    int numPasajeros = ingresarEntero(txtNumeroPasajerosCamioneta, "Número de Pasajeros");
                    int numPuertas = ingresarEntero(txtNumeroPuertasCamioneta, "Numero de Puertas");
                    int numBolsasAire = ingresarEntero(txtNumeroBolsasAireCamioneta, "Numero de Bolsas de Aire");
                    boolean aireAcondicionado = ingresarBooleano(txtAireAcondicionadoCamioneta, "Aire Acondicionado");
                    boolean abs = ingresarBooleano(txtAbsCamioneta, "ABS");
                    boolean velocidadCrucero = ingresarBooleano(txtVelocidadCruceroCamioneta, "Velocidad Crucero");
                    double capacidadMaletero = ingresarDouble(txtCapacidadMaleteroCamioneta, "Capacidad Maletero");
                    boolean camaraReversa = ingresarBooleano(txtCamaraReversaCamioneta, "Camara de Reversa");
                    boolean sensorColision = ingresarBooleano(txtSensorColisionCamioneta, "Sensor de Colicion");
                    boolean sensorTraficoCruzado = ingresarBooleano(txtSensorTraficoCruzadoCamioneta,
                            "Sensor de Trafico Cruzado");
                    boolean asistentePermanenciaCarril = ingresarBooleano(txtAsistentePermanenciaCarrilCamioneta,
                            "Asistente de Permanencia en el Carril");
                    boolean traccion = ingresarBooleano(txtTraccionCamioneta, "Tracción");

                    auxVehiculo = new Camioneta (codigo, marca, modelo, nuevo, cambios, velMax, cilindraje, numPasajeros, numPuertas,
                    numBolsasAire, combustion, transmision, aireAcondicionado, abs, velocidadCrucero, capacidadMaletero,
                    camaraReversa, sensorColision, sensorTraficoCruzado, asistentePermanenciaCarril, traccion);

                } else if (radioElectrico.isSelected()) {
                    double autonomia = ingresarDouble(txtAutonomiaElectrico, "Autonomía");
                    double tiempoCarga = ingresarDouble(txtTiempoCargaElectrico, "Tiempo de Carga");

                    auxVehiculo = new VehiculoElectrico(codigo, marca, modelo, nuevo, cambios, velMax, cilindraje,
                            tiempoCarga, autonomia, combustion,
                            transmision);

                } else if (radioHibrido.isSelected()) {

                    boolean enchufable = ingresarBooleano(txtEnchufableHibrido, "Enchufable");
                    boolean ligero = ingresarBooleano(txtLigeroHibrido, "Ligero");

                    auxVehiculo = new VehiculoHibrido(codigo, marca, modelo, nuevo, cambios, velMax, cilindraje,
                            enchufable, ligero, combustion,
                            transmision);
                }

                if (auxVehiculo != null) {
                    if (datosVehiculoController.verificarVehiculo(auxVehiculo.getCodigo()) != null) {
                        Alert alerta = new Alert(Alert.AlertType.ERROR);
                        alerta.setTitle("El Vehiculo ya existe");
                        alerta.setHeaderText("");
                        alerta.setContentText("Hay un vehiculo asociado al codigo ingresado");
                        alerta.showAndWait();
                    }
                } else {
                    datosVehiculoController.agregarVehiculo(auxVehiculo);
                    Alert alerta = new Alert(Alert.AlertType.INFORMATION);
                    alerta.setTitle("Vehiculo");
                    alerta.setHeaderText("");
                    alerta.setContentText("El vehiculo se ha creado con exito");
                    alerta.showAndWait();
                }
            } catch (Exception e) {
                Alert alerta = new Alert(Alert.AlertType.ERROR);
                alerta.setTitle("Error");
                alerta.setHeaderText("Ha ocurrido un error al guardar el vehículo.");
                alerta.setContentText("Revisa los datos ingresados");
                alerta.showAndWait();
            }
        }
    }

    private boolean ingresarBooleano(TextField textField, String nombreCampo) {
        String valor = textField.getText().trim().toLowerCase();

        if (valor.isEmpty()) {
            Alert alerta = new Alert(Alert.AlertType.WARNING);
            alerta.setTitle("Campo vacío");
            alerta.setHeaderText("Falta información en el campo " + nombreCampo);
            alerta.setContentText("Por favor, rellene el campo antes de continuar.");
            alerta.showAndWait();
            throw new IllegalArgumentException("El campo " + nombreCampo + " está vacío.");
        }

        if (valor.equals("si")) {
            return true;
        } else if (valor.equals("no")) {
            return false;
        } else {
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Valor no válido");
            alerta.setHeaderText("El campo " + nombreCampo + " contiene un valor no válido.");
            alerta.setContentText("Por favor, ingrese 'si' o 'no'.");
            alerta.showAndWait();
            throw new IllegalArgumentException("Valor no válido para el campo " + nombreCampo);
        }
    }

    private int ingresarEntero(TextField textField, String nombreCampo) {
        String valor = textField.getText().trim();

        if (valor.isEmpty()) {
            Alert alerta = new Alert(Alert.AlertType.WARNING);
            alerta.setTitle("Campo vacío");
            alerta.setHeaderText("Falta información en el campo " + nombreCampo);
            alerta.setContentText("Por favor, rellene el campo antes de continuar.");
            alerta.showAndWait();
            throw new IllegalArgumentException("El campo " + nombreCampo + " está vacío.");
        }

        try {
            return Integer.parseInt(valor);
        } catch (NumberFormatException e) {
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Valor no válido");
            alerta.setHeaderText("El campo " + nombreCampo + " contiene un valor no válido.");
            alerta.setContentText("Por favor, ingrese un número entero válido.");
            alerta.showAndWait();
            throw new IllegalArgumentException("Valor no válido para el campo " + nombreCampo + ": " + valor);
        }
    }

    private double ingresarDouble(TextField textField, String nombreCampo) {
        String valor = textField.getText().trim();

        if (valor.isEmpty()) {
            Alert alerta = new Alert(Alert.AlertType.WARNING);
            alerta.setTitle("Campo vacío");
            alerta.setHeaderText("Falta información en el campo " + nombreCampo);
            alerta.setContentText("Por favor, rellene el campo antes de continuar.");
            alerta.showAndWait();
            throw new IllegalArgumentException("El campo " + nombreCampo + " está vacío.");
        }

        try {
            return Double.parseDouble(valor);
        } catch (NumberFormatException e) {
            Alert alerta = new Alert(Alert.AlertType.ERROR);
            alerta.setTitle("Valor no válido");
            alerta.setHeaderText("El campo " + nombreCampo + " contiene un valor no válido.");
            alerta.setContentText("Por favor, ingrese un número válido (puede incluir decimales).");
            alerta.showAndWait();
            throw new IllegalArgumentException("Valor no válido para el campo " + nombreCampo + ": " + valor);
        }
    }

    @FXML
    private void txtCodigoAction(ActionEvent event) {
        // Lógica para manejar el evento
    }

    @FXML
    void btnBuscarAction(ActionEvent event) {

    }

    public void setApp(App app) {
        this.app = app;
    }

    @FXML
    void btnActualizarAction(ActionEvent event) {

    }

    @FXML
    void btnEliminarAction(ActionEvent event) {

    }

    @FXML
    void btnLimpiarAction(ActionEvent event) {

    }

    @FXML
    void btnSalirAction(ActionEvent event) {

    }

}
