package com.manager.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.layout.StackPane;

import java.io.IOException;

public class MainController {

    @FXML
    private StackPane contentPane;

    @FXML
    public void initialize() {
        loadView("home.fxml"); // vista inicial
    }

    @FXML
    private void goToRegister() {
        loadView("register.fxml");
    }

    @FXML
    private void goToHome() {
        loadView("home.fxml");
    }

    private void loadView(String fxml) {
        try {
            Node view = FXMLLoader.load(
                getClass().getResource("/com/manager/" + fxml)
            );
            contentPane.getChildren().setAll(view);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}