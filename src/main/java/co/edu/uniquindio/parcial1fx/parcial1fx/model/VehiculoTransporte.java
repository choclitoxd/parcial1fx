package co.edu.uniquindio.parcial1fx.parcial1fx.model;

import java.util.ArrayList;

public class VehiculoTransporte extends Vehiculo{
    private int maximoPasajero;
    private ArrayList<Usuario> listUsuario;
    public VehiculoTransporte(String placa, String modelo, String marca, String color, int maximoPasajero) {
        super(placa, modelo, marca, color);
        this.maximoPasajero = maximoPasajero;
        this.listUsuario = new ArrayList<>();
    }

    public int getMaximoPasajero() {
        return maximoPasajero;
    }

    public ArrayList<Usuario> getListUsuario() {
        return listUsuario;
    }

    @Override
    public String toString() {
        return "VehiculoTransporte{" +
                "maximoPasajero=" + maximoPasajero +
                "} " + super.toString();
    }
}
