package co.edu.uniquindio.parcial1fx.parcial1fx.model.builder;

import co.edu.uniquindio.parcial1fx.parcial1fx.model.Propetario;
import co.edu.uniquindio.parcial1fx.parcial1fx.model.Vehiculo;

import java.util.ArrayList;

public class PropetarioBuilder {
    protected String nombre;
    protected String cedula;
    protected String email;
    protected String celular;

    public PropetarioBuilder nombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public PropetarioBuilder cedula(String cedula) {
        this.cedula = cedula;
        return this;
    }

    public PropetarioBuilder email(String email) {
        this.email = email;
        return this;
    }

    public PropetarioBuilder celular(String celular) {
        this.celular = celular;
        return this;
    }

    public Propetario build() {
        return new Propetario(nombre, cedula, email, celular);
    }

}
