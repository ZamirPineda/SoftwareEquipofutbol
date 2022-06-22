package Ejercicio5;
public abstract class Persona {
    protected String nombre;
    protected String apellidos;
    protected int edad;

    public Persona(String nombre, String apellidos, int edad){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public String getNombre(){
        return nombre;
    }
    public String getApellidos(){
        return apellidos;
    }
    public int getEdad(){
        return edad;
    }
    public void viajar(){
        System.out.println("Viajar");
    }
    public abstract void partidoFutbol();
    public abstract void entrenamiento();
}
