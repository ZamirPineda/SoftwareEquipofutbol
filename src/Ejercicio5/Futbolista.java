package Ejercicio5;

public class Futbolista extends Persona{
    private int dorsal;
    private String posicion;

    public Futbolista(int dorsal, String posicion, String nombre, String apellidos, int edad){
        super(nombre,apellidos,edad);
        this.dorsal = dorsal;
        this.posicion = posicion;
    }
    public int getDorsal(){
        return dorsal;
    }
    public String getPosicion(){
        return posicion;
    }
    @Override
    public void partidoFutbol(){
        System.out.println("Juega el partido de fútbol");
    }
    @Override
    public void entrenamiento(){
        System.out.println("Entrena");
    }
    public void entrevista(){
        System.out.println("Da una entrevista");
    }
}
