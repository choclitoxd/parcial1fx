package co.edu.uniquindio.parcial1fx.parcial1fx.model.builder;

import co.edu.uniquindio.parcial1fx.parcial1fx.model.Usuario;

public class UsuriaBuilder {
    protected int edad;
    public UsuriaBuilder edad(int edad){
        this.edad = edad;
        return this;
    }
    public Usuario build(){
        return new Usuario(edad);
    }
}
