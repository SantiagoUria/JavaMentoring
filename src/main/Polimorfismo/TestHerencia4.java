package main.Polimorfismo;

public class TestHerencia4 {

    public static void main(String[] args) {

        PersonajePrincipal p1 = new PersonajePrincipal("Levi", "Ackerman", 35, 12 / 11, "Ejercito");
        System.out.println(p1.saludar());
        PersonajeSecundario p2 = new PersonajeSecundario("Jean", "Kirschtein", 18, 12/10, "Ejercito");
        System.out.println(p2.saludar());
    }
}
