package co.edu.uniquindio.parcial1fx.parcial1fx.model;

import java.util.ArrayList;

public class EmpresaTransporte {
    private String nombre;
    private ArrayList<Propetario> listPropetario;
    private ArrayList<VehiculoCarga> listVehiculoCarga;
    private ArrayList<VehiculoTransporte> listVehiculoTransporte;
    private ArrayList<Usuario> listUsuario;
    public EmpresaTransporte() {
        this.listPropetario = new ArrayList<>();
        this.listVehiculoCarga = new ArrayList<>();
        this.listVehiculoTransporte = new ArrayList<>();
        this.listUsuario = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Propetario> getListPropetario() {
        return listPropetario;
    }

    public void setListPropetario(ArrayList<Propetario> listPropetario) {
        this.listPropetario = listPropetario;
    }

    public ArrayList<VehiculoCarga> getListVehiculoCarga() {
        return listVehiculoCarga;
    }

    public void setListVehiculoCarga(ArrayList<VehiculoCarga> listVehiculoCarga) {
        this.listVehiculoCarga = listVehiculoCarga;
    }

    public ArrayList<VehiculoTransporte> getListVehiculoTransporte() {
        return listVehiculoTransporte;
    }

    public void setListVehiculoTransporte(ArrayList<VehiculoTransporte> listVehiculoTransporte) {
        this.listVehiculoTransporte = listVehiculoTransporte;
    }

    public ArrayList<Usuario> getListUsuario() {
        return listUsuario;
    }

    public void setListUsuario(ArrayList<Usuario> listUsuario) {
        this.listUsuario = listUsuario;
    }

    @Override
    public String toString() {
        return "EmpresaTransporte{" +
                "nombre='" + nombre + '\'' +
                ", listPropetario=" + listPropetario +
                ", listVehiculoCarga=" + listVehiculoCarga +
                ", listVehiculoTransporte=" + listVehiculoTransporte +
                ", listUsuario=" + listUsuario +
                '}';
    }
    public String guardarUsuario(String placa,Usuario usuario){
        String mensaje = "";
        for (VehiculoTransporte vehiculoTransporte: this.listVehiculoTransporte){
            if (vehiculoTransporte.getPlaca().equals(placa)){
                vehiculoTransporte.getListUsuario().add(usuario);
                this.getListUsuario().add(usuario);
                mensaje = "Guardado";
                break;
            }
            else
                mensaje = "No encontro el vehiculo";
        }
        return mensaje;
    }
    public String asignarVehiculo(String cedulo,String placa){
        String mensaje = "";
        for (Propetario propetario:this.listPropetario){
            if (propetario.getCedula().equals(cedulo)){
                for (VehiculoTransporte vehiculoTransporte: this.listVehiculoTransporte){
                    System.out.println(vehiculoTransporte.getPlaca());
                    if (vehiculoTransporte.getPlaca().equals(placa)){
                        propetario.getListVehiculo().add(vehiculoTransporte);
                        mensaje = "Asginado";
                    }
                    else{
                        for (VehiculoCarga vehiculoCarga:this.listVehiculoCarga){
                            System.out.println(vehiculoCarga.getPlaca());
                            if (vehiculoCarga.getPlaca().equals(placa)){
                                propetario.getListVehiculo().add(vehiculoCarga);
                                mensaje = "Asginado";
                            }else{

                                mensaje = "No existe esa placa " + placa;
                            }
                        }
                    }
                }
            }else {
                mensaje = "No exite esta cedula " + cedulo;
            }
        }
        return mensaje;
    }
}
