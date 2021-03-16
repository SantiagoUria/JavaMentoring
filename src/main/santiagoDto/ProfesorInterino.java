package main.santiagoDto;

public class ProfesorInterino extends Profesor {

    public void Presentarse() {
        System.out.println("Hola, soy su " + getProf2() + ", mi nombre es " + getNombre() + " " + getApellido());
    }

    public ProfesorInterino(String nombre, String apellidos, int edad, String materia) {
        super(nombre, apellidos, edad, materia);
    }

}
