package co.edu.uniquindio.parcial1fx.parcial1fx.model;

import java.util.ArrayList;

public class Propetario {
    private String nombre;
    private String cedula;
    private String email;
    private String celular;
    private ArrayList<Vehiculo> listVehiculo;

    private Propetario() {
    }

    public Propetario(String nombre, String cedula, String email, String celular) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.email = email;
        this.celular = celular;
        this.listVehiculo = new ArrayList<Vehiculo>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public String getEmail() {
        return email;
    }

    public String getCelular() {
        return celular;
    }

    public ArrayList<Vehiculo> getListVehiculo() {
        return listVehiculo;
    }

    @Override
    public String toString() {
        return "Asociado{" +
                "nombre='" + nombre + '\'' +
                ", cedula='" + cedula + '\'' +
                ", email='" + email + '\'' +
                ", celular='" + celular + '\'' +
                ", listVehiculo=" + listVehiculo +
                '}';
    }
}
