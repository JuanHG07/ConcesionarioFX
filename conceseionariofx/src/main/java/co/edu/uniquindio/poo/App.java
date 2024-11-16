package co.edu.uniquindio.poo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

import co.edu.uniquindio.poo.model.Concesionario;
import co.edu.uniquindio.poo.viewController.LoginViewController;

/**
 * JavaFX App
 */
public class App extends Application {

    private Stage loginStage;

    LoginViewController loginViewController;

    public static Concesionario concesionario = new Concesionario("TU CARRO UQ");

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage loginStage) throws IOException {
        this.loginStage = loginStage;
        this.loginStage.setTitle("Gestion de la Empresa");
        openViewLogin();
    }

    private void openViewLogin() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("LoginView.fxml"));
            Parent root = loader.load();

            loginViewController = loader.getController();
            loginViewController.setApp(this);

            Scene scene = new Scene(root);
            loginStage.setScene(scene);
            loginStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}