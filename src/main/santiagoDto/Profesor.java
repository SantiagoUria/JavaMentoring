package main.santiagoDto;

public class Profesor {
    private String nombre;
    private String apellido;
    private int edad;
    private String materia;
    private static final String prof1 = "profesor titular";
    private static final String prof2 = "profesor interino";

    public Profesor() {
        nombre = "";
        apellido = "";
        edad = 0;
        materia = "";
    }

    public Profesor(String nombre, String apellido, int edad, String materia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.materia = materia;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public String getMateria() {
        return materia;
    }

    public String getProf1() {
        return prof1;
    }

    public String getProf2() {
        return prof2;
    }

    public String toString() {
        Integer datoEdad = edad;
        return "Profesor: ".concat(nombre).concat(" ").concat(apellido).concat("\nEdad: ")
                .concat(datoEdad.toString()).concat("\n*************************");
    }
}
