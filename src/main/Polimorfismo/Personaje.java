package main.Polimorfismo;

public class Personaje {

    private String firstName;
    private String lastName;
    private int age;
    private int birthDay;
    private String rol;

    public Personaje(String firstName, String lastName, int age, int birthDay, String rol) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.birthDay = birthDay;
        this.rol = rol;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public String getRol() {
        return rol;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBirthday(int birthDay) {
        this.birthDay = birthDay;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String saludar() {
        return "Hola, mi nombre es " + getFirstName() + " " + getLastName() + " Trabajo:" + getRol();
    }
}
