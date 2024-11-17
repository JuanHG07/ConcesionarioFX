package co.edu.uniquindio.poo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

import co.edu.uniquindio.poo.model.Concesionario;
import co.edu.uniquindio.poo.viewController.AdministradorViewController;
import co.edu.uniquindio.poo.viewController.DatosClienteViewController;
import co.edu.uniquindio.poo.viewController.DatosEmpleadoViewController;
import co.edu.uniquindio.poo.viewController.LoginViewController;
import co.edu.uniquindio.poo.viewController.RestablecerViewController;

/**
 * JavaFX App
 */
public class App extends Application {

    private Stage loginStage;
    private Stage restablecerStage;
    private Stage administradorStage;
    private Stage datosEmpleadoStage;
    private Stage datosClienteStage;

    LoginViewController loginViewController;
    RestablecerViewController restablecerViewController;
    AdministradorViewController administradorViewController;
    DatosEmpleadoViewController datosEmpleadoViewController;
    DatosClienteViewController datosClienteViewController;


    public static Concesionario concesionario = new Concesionario("TU CARRO UQ");

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage loginStage) throws IOException {
        this.loginStage = loginStage;
        this.loginStage.setTitle("Gestion de la Empresa");
        openLoginView();
    }

    public void openLoginView() {

        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("LoginView.fxml"));
            Parent root = loader.load();

            loginViewController = loader.getController();
            loginViewController.setApp(this);

            Scene scene = new Scene(root);
            loginStage = new Stage();
            loginStage.setScene(scene);

            loginStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void openRestablecerView() {

        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("RestablecerView.fxml"));
            Parent root = loader.load();

            restablecerViewController = loader.getController();
            restablecerViewController.setApp(this);

            Scene scene = new Scene(root);
            restablecerStage = new Stage();
            restablecerStage.initModality(Modality.WINDOW_MODAL);
            restablecerStage.setScene(scene);

            restablecerStage.showAndWait();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void openAdministradorView() {

        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("AdministradorView.fxml"));
            Parent root = loader.load();

            administradorViewController = loader.getController();
            administradorViewController.setApp(this);

            Scene scene = new Scene(root);
            administradorStage = new Stage();
            administradorStage.setScene(scene);

            administradorStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void openDatosEmpleadoView() {

        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("DatosEmpleadoView.fxml"));
            Parent root = loader.load();

            datosEmpleadoViewController = loader.getController();
            datosEmpleadoViewController.setApp(this);

            Scene scene = new Scene(root);
            datosEmpleadoStage = new Stage();
            datosEmpleadoStage.initModality(Modality.WINDOW_MODAL);
            datosEmpleadoStage.setScene(scene);

            datosEmpleadoStage.showAndWait();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void openDatosClienteView() {

        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("DatosClienteView.fxml"));
            Parent root = loader.load();

            datosClienteViewController = loader.getController();
            datosClienteViewController.setApp(this);

            Scene scene = new Scene(root);
            datosClienteStage = new Stage();
            datosClienteStage.initModality(Modality.WINDOW_MODAL);
            datosClienteStage.setScene(scene);

            datosClienteStage.showAndWait();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public LoginViewController getLoginViewController() {
        return loginViewController;
    }
}