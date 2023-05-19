package com.talkio.files.talkio.Frontend.welcome;


import com.talkio.files.talkio.Frontend.Login.SignInController;
import io.github.palexdev.materialfx.controls.MFXButton;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.security.Signature;
import java.util.ResourceBundle;

public class WelcomeController implements Initializable {
    private Stage stage;
    private Parent root;
    private Scene scene;

    @FXML
    private MFXButton loginBtn;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        loginBtn.setOnAction(e -> {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    Platform.runLater(()->{
                        try {
                            Parent root=FXMLLoader.load(SignInController.class.getResource("sign_in.fxml"));
                            stage= (Stage) ((Node)e.getSource()).getScene().getWindow();
                            scene=new Scene(root);
                            stage.setScene(scene);
                            stage.show();
                        } catch (IOException ex) {
                            throw new RuntimeException(ex);
                        }
                    });
                }
            }).start();
        });
    }
}
