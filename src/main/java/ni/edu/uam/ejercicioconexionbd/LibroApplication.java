package ni.edu.uam.ejercicioconexionbd;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class LibroApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {

        FXMLLoader fxmlLoader = new FXMLLoader(
                LibroApplication.class.getResource("/ni/edu/uam/ejercicioconexionbd/libro.fxml"
                )
        );

        Scene scene = new Scene(fxmlLoader.load(), 600, 700);

        stage.setTitle("Registro de Libros");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}