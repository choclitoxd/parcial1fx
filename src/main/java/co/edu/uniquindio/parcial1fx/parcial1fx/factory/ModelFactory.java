package co.edu.uniquindio.parcial1fx.parcial1fx.factory;

import co.edu.uniquindio.parcial1fx.parcial1fx.model.*;
import co.edu.uniquindio.parcial1fx.parcial1fx.model.builder.PropetarioBuilder;
import co.edu.uniquindio.parcial1fx.parcial1fx.model.builder.UsuriaBuilder;
import co.edu.uniquindio.parcial1fx.parcial1fx.model.builder.VehiculoCargaBuilder;
import co.edu.uniquindio.parcial1fx.parcial1fx.model.builder.VehiculoTransporteBuilder;

public class ModelFactory {
    private static ModelFactory modelFactory;
    private EmpresaTransporte empresaTransporte;
    private ModelFactory(){
        empresaTransporte = new EmpresaTransporte();
        inicializarDatos();
    }
    public static ModelFactory getInstancia() {
        if(modelFactory == null) {
            modelFactory = new ModelFactory();
        }
        return modelFactory;
    }
    private void inicializarDatos(){
        // Inicializar Usuario
        Usuario usuario = new UsuriaBuilder().edad(30).build();

        // Inicializar Propietario
        Propetario propietario = new PropetarioBuilder()
                .nombre("María")
                .cedula("987654321")
                .email("maria@example.com")
                .celular("9876543210")
                .build();

        // Inicializar VehiculoCarga
        VehiculoCarga vehiculoCarga = new VehiculoCargaBuilder()
                .placa("JKL012")
                .modelo("ModeloCarga2")
                .marca("MarcaCarga2")
                .color("Negro")
                .capacidadCarga(8000)
                .numeroEjes(8)
                .build();
        propietario.getListVehiculo().add(vehiculoCarga);
        // Inicializar VehiculoTransporte
        VehiculoTransporte vehiculoTransporte = new VehiculoTransporteBuilder()
                .placa("MNO345")
                .modelo("ModeloTransporte")
                .marca("MarcaTransporte")
                .color("Blanco")
                .maximoPasajero(50)
                .build();
        vehiculoTransporte.getListUsuario().add(usuario);
        propietario.getListVehiculo().add(vehiculoTransporte);
        // Inicializar EmpresaTransporte
        empresaTransporte.setNombre("Transportes Rápidos");
        empresaTransporte.getListPropetario().add(propietario);
        empresaTransporte.getListVehiculoCarga().add(vehiculoCarga);
        empresaTransporte.getListVehiculoTransporte().add(vehiculoTransporte);
        empresaTransporte.getListUsuario().add(usuario);
        // Agregar más propietarios, vehículos, etc., según sea necesario
    }
    public String guardarVehiculoTransporte(VehiculoTransporte vehiculoTransporte){
        empresaTransporte.getListVehiculoTransporte().add(vehiculoTransporte);
        return "Guardado";
    }
    public String guardarVehiculoCarga(VehiculoCarga vehiculoCarga){
        empresaTransporte.getListVehiculoCarga().add(vehiculoCarga);
        System.out.println(empresaTransporte.getListVehiculoCarga());
        return "Guardado";
    }
    public String guardarPropetario(Propetario propetario){
        empresaTransporte.getListPropetario().add(propetario);
        return "Guardado";
    }
    public String guardarUsuario(String placa,Usuario usuario){
        return empresaTransporte.guardarUsuario(placa,usuario);
    }
    public String asignarVehiculo(String cedulo,String placa){
        return empresaTransporte.asignarVehiculo(cedulo,placa);
    }

}
