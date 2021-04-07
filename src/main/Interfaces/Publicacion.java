package main.Interfaces;

/**
 * LibroRevista
 */
public class Publicacion {
    
    private String code;
    private String title;
    private int year;

    public Publicacion(String code, String title, int year) {
        this.code = code;
        this.title = title;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    public String getCode(){
        return code;
    }

    public void setCode(String code){
        this.code = code;
    }
    public String info() {
        return "Codigo: " + code + " | Año: " + year;
    }
    public Publicacion(){}
}