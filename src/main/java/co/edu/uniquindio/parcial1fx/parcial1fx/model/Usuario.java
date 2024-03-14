package co.edu.uniquindio.parcial1fx.parcial1fx.model;

public class Usuario {
    private int edad;
    private Usuario(){}

    public Usuario(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "edad=" + edad +
                '}';
    }
}
