package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class ColorFecha extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Crear etiquetas
        Label dateLabel = new Label("Selecciona una fecha:");
        Label colorLabel = new Label("Selecciona un color:");

        // Crear controles
        DatePicker datePicker = new DatePicker();
        ColorPicker colorPicker = new ColorPicker();
        Button submitButton = new Button("Confirmar Selección");

        // Crear un VBox y añadir los controles
        VBox vbox = new VBox(10, dateLabel, datePicker, colorLabel, colorPicker, submitButton);

        // Crear la primera pestaña  y añadir el VBox
        Tab tab1 = new Tab("Selección", vbox);
        tab1.setClosable(false); // Evita que la pestaña se pueda cerrar

        // Crear un VBox para la segunda pestaña 
        VBox resultBox = new VBox(10);
        Label resultLabel = new Label();
        resultBox.getChildren().add(resultLabel);

        // Crear la segunda pestaña (Tab) y añadir el VBox de resultados
        Tab tab2 = new Tab("Resultados", resultBox);
        tab2.setClosable(false); // Evitar que la pestaña se pueda cerrar

        // Crear un TabPane y añadir las dos pestañas
        TabPane tabPane = new TabPane(tab1, tab2);

        // lo que pasa al  presionar el botón
        submitButton.setOnAction(event -> {
            // Obtener la fecha y el color seleccionados
            String selectedDate = datePicker.getValue() != null ? datePicker.getValue().toString() : "No se ha elejido una fecha";
            if (colorPicker.getValue() != null) {
				colorPicker.getValue().toString();
			}

            // Mostrar la selección en la etiqueta de resultados
            resultLabel.setText("Fecha: " + selectedDate);
            resultLabel.setTextFill(colorPicker.getValue());

            // Cambiar a la pestaña de resultados
            tabPane.getSelectionModel().select(tab2);
        });

        // Crear la escena y añadir el TabPane
        Scene scene = new Scene(tabPane, 400, 300);
        // Cargar el archivo CSS
        scene.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        primaryStage.setTitle("Tarea FechaColor");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
