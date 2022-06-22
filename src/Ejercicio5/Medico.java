package Ejercicio5;

public class Medico extends Persona{
    private String titulacion;
    private int añosExperiencia;

    public Medico(String titulacion, int añosExperiencia, String nombre, String apellidos, int edad){
        super(nombre,apellidos,edad);
        this.titulacion = titulacion;
        this.añosExperiencia = añosExperiencia;
    }
    public String getTitulacion(){
        return titulacion;
    }
    public int getAñosExperiencia(){
        return añosExperiencia;
    }
    @Override
    public void partidoFutbol(){
        System.out.println("Da asistencia en un pártido de fútbol");
    }
    @Override
    public void entrenamiento(){
        System.out.println("Da asistencia en un entrenamiento");
    }
    public void curarLesion(){
        System.out.println("Curar lesion");
    }
}
