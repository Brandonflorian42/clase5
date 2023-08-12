package Padre;

public abstract class Empleado {
    public String getNombre() {
        return nombre;
    }



    public void setNombre(String nombre) {
        if (nombre.equals("homero")) {
            this.nombre = "No homeros";
        } else {
            this.nombre = nombre;
        }
    }


    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    private String nombre;
    private double sueldo;

    public Empleado(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;

    }
    public String obtenerDetalles(){
        return "nombre: "+this.getNombre()+"sueldo:"+this.getSueldo();
    }


    public abstract String obtnerDetalles();
}
