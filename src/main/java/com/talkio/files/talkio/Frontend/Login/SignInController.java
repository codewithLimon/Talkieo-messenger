package com.talkio.files.talkio.Frontend.Login;

import com.talkio.files.talkio.Frontend.welcome.WelcomeController;
import io.github.palexdev.materialfx.controls.MFXButton;
import io.github.palexdev.materialfx.controls.MFXPasswordField;
import io.github.palexdev.materialfx.controls.MFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class SignInController implements Initializable {
    @FXML
    private MFXTextField emailBox;
    @FXML
    private MFXPasswordField passBox;
    @FXML
    private MFXButton loginButton;
    @FXML
    private MFXButton googleButton;

    @FXML
    private MFXButton go_back;
    private Stage stage;
    private Parent root;
    private Scene scene;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        emailBox.setPromptText("Email");
        emailBox.setStyle("-fx-background-color: rgba(255,255,255,0.95);" +
                " -fx-prompt-text-fill: #ffffff; -fx-text-fill: black;" +
                "-fx-padding: 0 0 0 10px;-fx-background-radius: 6px ;" +
                "-fx-border-radius: 7px; -fx-border-width: 2px; " +
                "-fx-border-color: white;" +
                "-fx-font-size: 13px");
        passBox.setPromptText("Password");
        passBox.setStyle("-fx-background-color: rgba(255,255,255,0.95);" +
                " -fx-prompt-text-fill: #ffffff; -fx-text-fill: black;" +
                "-fx-padding: 0 0 0 10px;-fx-background-radius: 6px ;" +
                "-fx-border-radius: 7px; -fx-border-width: 2px; " +
                "-fx-border-color: white;" +
                "-fx-font-size: 13px");


       loginButton.setStyle("-fx-background-color: #0084ff;" +
               "-fx-text-fill: white;" +
               "-fx-background-radius: 6px ;" +
               "-fx-border-radius: 7px; -fx-border-width: 2px; " +
               "-fx-border-color: #0084ff;" +
               "-fx-font-size: 15px;" +
               "-fx-font-family: Calibri;" +
               "-fx-font-weight: bold");

       googleButton.setStyle("-fx-background-color: #ffffff;" +
               " -fx-text-fill: black;" +
               "-fx-background-radius: 6px ;" +
               "-fx-border-radius: 7px; -fx-border-width: 2px; " +
               "-fx-border-color: #ababab;" +
               "-fx-font-size: 14px;" +
               "-fx-font-family: Calibri;" +
               "-fx-font-weight: bold");


       go_back.setOnAction(event -> {
           try {
               Parent root= FXMLLoader.load(WelcomeController.class.getResource("welcome.fxml"));
               stage= (Stage) ((Node)event.getSource()).getScene().getWindow();
               scene=new Scene(root);
               stage.setScene(scene);
               stage.show();
           } catch (IOException ex) {
               throw new RuntimeException(ex);
           }
       });

       googleButton.setOnAction(event -> {
           Alert alert=new Alert(Alert.AlertType.INFORMATION);
           alert.setHeaderText("Google sign in");
           alert.showAndWait();
       });

        loginButton.setOnAction(event -> {
            Alert alert=new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText("Sign in");
            alert.showAndWait();
        });
    }
}
