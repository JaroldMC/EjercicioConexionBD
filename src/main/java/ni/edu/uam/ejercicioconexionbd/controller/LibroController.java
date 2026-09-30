package ni.edu.uam.ejercicioconexionbd.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import ni.edu.uam.ejercicioconexionbd.model.Libro;

public class LibroController {
    @FXML
    private TextField txtID;
    @FXML
    private TextField txtTitulo;
    @FXML
    private TextField txtAutor;
    @FXML
    private TextField txtPrecio;
    @FXML
    private TextField txtStock;
    @FXML
    private ComboBox cmbCategoria;

    @FXML
    private TableView<Libro> tblLibros;
    @FXML
    private TableColumn<Libro, Integer> colID;
    @FXML
    private TableColumn<Libro, String> colTitulo;
    @FXML
    private TableColumn<Libro, String > colAutor;
    @FXML
    private TableColumn<Libro, String > colCategoria;
    @FXML
    private TableColumn<Libro, Double > colPrecio;
    @FXML
    private TableColumn<Libro, Integer> colStock;

    private final ObservableList<Libro> ListaLibros = FXCollections.observableArrayList();
    @FXML
    private void initialize() {
        configurarTabla();
        configurarComboBox();
        cargarLibros();
    }

    private void configurarTabla(){
        colID.setCellValueFactory(new PropertyValueFactory<>("id"));
        colTitulo.setCellValueFactory(new PropertyValueFactory<>("título"));
        colAutor.setCellValueFactory(new PropertyValueFactory<>("autor"));
        colCategoria.setCellValueFactory(new PropertyValueFactory<>("categoria"));
        colPrecio.setCellValueFactory(new PropertyValueFactory<>("precio"));
        colStock.setCellValueFactory(new PropertyValueFactory<>("stock"));
    }

    private void configurarComboBox(){
        cmbCategoria.getItems().clear();
        cmbCategoria.getItems().addAll("Tecnología", "Filosofía", "Programación", "Ciencia ficción", "Otros");
    }

    @FXML
    private void cargarLibros(){
        ListaLibros.Clear

    }


}
