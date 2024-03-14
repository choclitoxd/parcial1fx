package co.edu.uniquindio.parcial1fx.parcial1fx.model.builder;

import co.edu.uniquindio.parcial1fx.parcial1fx.model.VehiculoTransporte;

public class VehiculoTransporteBuilder extends VehiculoBuilder<VehiculoTransporteBuilder>{
    private int maximoPasajero;
    public VehiculoTransporteBuilder maximoPasajero(int maximoPasajero){
        this.maximoPasajero = maximoPasajero;
        return this;
    }
    public VehiculoTransporte build(){
        return new VehiculoTransporte(placa, modelo, marca, color,maximoPasajero);
    }
    @Override
    protected VehiculoTransporteBuilder self() {
        return this;
    }
}
