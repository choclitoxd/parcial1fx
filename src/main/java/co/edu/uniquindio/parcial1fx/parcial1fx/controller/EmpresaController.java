package co.edu.uniquindio.parcial1fx.parcial1fx.controller;

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.uniquindio.parcial1fx.parcial1fx.factory.ModelFactory;
import co.edu.uniquindio.parcial1fx.parcial1fx.model.Propetario;
import co.edu.uniquindio.parcial1fx.parcial1fx.model.Usuario;
import co.edu.uniquindio.parcial1fx.parcial1fx.model.VehiculoCarga;
import co.edu.uniquindio.parcial1fx.parcial1fx.model.VehiculoTransporte;
import co.edu.uniquindio.parcial1fx.parcial1fx.model.builder.PropetarioBuilder;
import co.edu.uniquindio.parcial1fx.parcial1fx.model.builder.UsuriaBuilder;
import co.edu.uniquindio.parcial1fx.parcial1fx.model.builder.VehiculoCargaBuilder;
import co.edu.uniquindio.parcial1fx.parcial1fx.model.builder.VehiculoTransporteBuilder;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class EmpresaController {

    ModelFactory modelFactory;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextArea txtPropetario;

    @FXML
    private TextArea txtVehiculoC;

    @FXML
    private TextField txtMarcaC;

    @FXML
    private TextField txtPlacaT;

    @FXML
    private TextField txtEdad;

    @FXML
    private TextField txtCedula;

    @FXML
    private Button btnAsignarVehiculo;

    @FXML
    private TextField txtPlacaUsuario;

    @FXML
    private TextField txtNombre;

    @FXML
    private TextArea txtVehiculoT;

    @FXML
    private TextField txtColorC;

    @FXML
    private TextField txtPlacaAsignar;

    @FXML
    private Button btnUsuario;

    @FXML
    private TextField txtModeloT;

    @FXML
    private Button btnRegistrarPropetario;

    @FXML
    private TextField txtCedulaAsignar;

    @FXML
    private TextField txtColorT;

    @FXML
    private TextField txtCelular;

    @FXML
    private TextField txtEmail;

    @FXML
    private Button btnRegistrarVehiculoT;

    @FXML
    private TextArea txtUsuario;

    @FXML
    private TextField txtModeloC;

    @FXML
    private TextField txtPlacaC;

    @FXML
    private TextField txtNumeroEjes;

    @FXML
    private TextField txtNumeroMaximoPasajeros;

    @FXML
    private TextField txtCapacidad;

    @FXML
    private TextField txtMarcaT;

    @FXML
    private Button btnRegistrarVehiculoC;

    @FXML
    void initialize() {
        modelFactory = ModelFactory.getInstancia();
    }

    @FXML
    void registroVehiculoT(ActionEvent event) {
        VehiculoTransporte vehiculoTransporte = new VehiculoTransporteBuilder()
                .placa(txtPlacaT.getText().toLowerCase())
                .marca(txtMarcaT.getText())
                .color(txtColorT.getText())
                .modelo(txtModeloT.getText())
                .maximoPasajero(Integer.parseInt(txtNumeroMaximoPasajeros.getText()))
                .build();
        txtVehiculoT.setText(modelFactory.guardarVehiculoTransporte(vehiculoTransporte));
    }

    @FXML
    void registroPropetario(ActionEvent event) {
        Propetario propetario = new PropetarioBuilder()
                .nombre(txtNombre.getText().toLowerCase())
                .cedula(txtCedula.getText())
                .celular(txtCelular.getText())
                .email(txtEmail.getText())
                .build();
        txtPropetario.setText(modelFactory.guardarPropetario(propetario));
    }
    @FXML
    void registroVehiculoC(ActionEvent event) {
        VehiculoCarga vehiculoCarga = new VehiculoCargaBuilder()
                .placa(txtPlacaC.getText())
                .marca(txtMarcaC.getText())
                .color(txtColorC.getText())
                .modelo(txtModeloC.getText())
                .capacidadCarga(Double.parseDouble(txtCapacidad.getText()))
                .numeroEjes(Integer.parseInt(txtNumeroEjes.getText()))
                .build();
        txtVehiculoC.setText(modelFactory.guardarVehiculoCarga(vehiculoCarga));
    }

    @FXML
    void RegistroUsuario(ActionEvent event) {
        Usuario usuario = new UsuriaBuilder()
                .edad(Integer.parseInt(txtEdad.getText()))
                .build();
        txtUsuario.setText(modelFactory.guardarUsuario(txtPlacaUsuario.getText(),usuario));
    }
    @FXML
    void asignarVehiculo(ActionEvent event) {
        txtPropetario.setText(modelFactory.asignarVehiculo(txtCedulaAsignar.getText().toLowerCase(),txtPlacaAsignar.getText().toLowerCase()));
    }
}

