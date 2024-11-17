package co.edu.uniquindio.poo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

import co.edu.uniquindio.poo.model.Concesionario;
import co.edu.uniquindio.poo.viewController.LoginViewController;
import co.edu.uniquindio.poo.viewController.RestablecerViewController;

/**
 * JavaFX App
 */
public class App extends Application {

    private Stage loginStage;
    private Stage restablecerStage;

    LoginViewController loginViewController;
    RestablecerViewController restablecerViewController;

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

            if (loginStage == null) {
                
                FXMLLoader loader = new FXMLLoader(getClass().getResource("LoginView.fxml"));
                Parent root = loader.load();

                loginViewController = loader.getController();
                loginViewController.setApp(this);

                Scene scene = new Scene(root);
                loginStage = new Stage();
                loginStage.setScene(scene);
            }

            loginStage.show();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void openRestablecerView() {

        try {

            if (restablecerStage == null) {

                FXMLLoader loader = new FXMLLoader(getClass().getResource("RestablecerView.fxml"));
                Parent root = loader.load();

                restablecerViewController = loader.getController();
                restablecerViewController.setApp(this);

                Scene scene = new Scene(root);
                restablecerStage = new Stage();
                restablecerStage.initModality(Modality.WINDOW_MODAL);
                restablecerStage.setScene(scene);
            }

            restablecerStage.showAndWait();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public LoginViewController getLoginViewController() {
        return loginViewController;
    }
}