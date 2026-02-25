package com.manager.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.ListView;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

import java.io.IOException;

public class MainController {

    @FXML
    private StackPane contentPane;
    
    @FXML
    private ListView<String> menuList;

    @FXML
    private SplitPane splitPane;

    @FXML
    private VBox sideMenu;

    @FXML
    private CheckMenuItem toggleSideMenu;

    @FXML
    public void initialize() {
        loadView("home.fxml"); // vista inicial

        menuList.getItems().addAll(
            "Opción 1",
            "Opción 2",
            "Opción 3",
            "Opción 4",
            "Opción 5",
            "Opción 6",
            "Opción 7",
            "Opción 8",
            "Opción 9",
            "Opción 10"
        );

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

    @FXML
    private void toggleSideMenu() {

        if (toggleSideMenu.isSelected()) {
            if (!splitPane.getItems().contains(sideMenu)) {
                splitPane.getItems().add(0, sideMenu);
                splitPane.setDividerPositions(0.1);
            }
        } else {
            splitPane.getItems().remove(sideMenu);
        }
    }


}