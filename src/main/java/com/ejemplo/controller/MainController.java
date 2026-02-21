package com.ejemplo.controller;

import com.ejemplo.model.Person;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class MainController {

    @FXML
    private TableView<Person> tableView;

    @FXML
    private TableColumn<Person, String> nameColumn;

    @FXML
    private TableColumn<Person, Integer> ageColumn;

    @FXML
    public void initialize() {

        // Configurar columnas
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        ageColumn.setCellValueFactory(new PropertyValueFactory<>("age"));

        // Datos de prueba
        ObservableList<Person> data = FXCollections.observableArrayList(
                new Person("Carlos", 25),
                new Person("Ana", 30),
                new Person("Lucía", 22)
        );

        tableView.setItems(data);
    }
}