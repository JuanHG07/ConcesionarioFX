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
import co.edu.uniquindio.poo.viewController.AgregarEmpleadoViewController;
import co.edu.uniquindio.poo.viewController.LoginViewController;
import co.edu.uniquindio.poo.viewController.RestablecerViewController;

/**
 * JavaFX App
 */
public class App extends Application {

    private Stage loginStage;
    private Stage restablecerStage;
    private Stage administradorStage;
    private Stage agregarEmpladoStage;

    LoginViewController loginViewController;
    RestablecerViewController restablecerViewController;
    AdministradorViewController administradorViewController;
    AgregarEmpleadoViewController agregarEmpleadoViewController;


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

    public void openAgregarEmpleadoView() {

        try {

            FXMLLoader loader = new FXMLLoader(getClass().getResource("AgregarEmpleadoView.fxml"));
            Parent root = loader.load();

            agregarEmpleadoViewController = loader.getController();
            agregarEmpleadoViewController.setApp(this);

            Scene scene = new Scene(root);
            agregarEmpladoStage = new Stage();
            agregarEmpladoStage.initModality(Modality.WINDOW_MODAL);
            agregarEmpladoStage.setScene(scene);

            restablecerStage.showAndWait();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public LoginViewController getLoginViewController() {
        return loginViewController;
    }
}