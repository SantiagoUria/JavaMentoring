package main.santiagoDto;
public class Gato {

    private String nombre;
    private String raza;
    private String color;
    private int edad;

    public void comer(){
        System.out.println(this.nombre + " está comiendo.");
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    };

    public String getNombre() {
        return nombre;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }
    
    public Gato(){}
}