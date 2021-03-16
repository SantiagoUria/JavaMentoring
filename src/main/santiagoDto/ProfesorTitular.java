package main.santiagoDto;

public class ProfesorTitular extends Profesor {

    public void Presentarse() {
        System.out.println("Hola, soy su" + getProf1() +" y esta materia es " + getMateria());
    }

    public ProfesorTitular(String nombre, String apellidos, int edad, String materia) {
        super(nombre, apellidos, edad, materia);
    }

}
