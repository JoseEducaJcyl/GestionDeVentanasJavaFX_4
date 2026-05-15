package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceDialog;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Button boton = new Button("Boton");
        boton.setOnAction(e -> {
            mostrarSeleccion();
        });

        Scene scene = new Scene(boton, 300, 250);
        stage.setScene(scene);
        stage.show();
    }

    private void mostrarSeleccion() {
        List<String> opciones = new ArrayList<>();
        opciones.add("Opcion 1");
        opciones.add("Opcion 2");
        opciones.add("Opcion 3");
        opciones.add("Opcion 4");

        ChoiceDialog<String> dialogo = new ChoiceDialog<>("Opcion 1", opciones);
        dialogo.setTitle("Seleccion de opcion");
        dialogo.setHeaderText("Elija una opcion");
        dialogo.setContentText("Opciones:");

        Optional<String> resultado = dialogo.showAndWait();

        if (resultado.isPresent()) {
            String opcionSeleccionada = resultado.get();
            System.out.println("Opcion elegida: " + opcionSeleccionada);
        }else  {
            System.out.println("No se ha seleccionado nada");
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
