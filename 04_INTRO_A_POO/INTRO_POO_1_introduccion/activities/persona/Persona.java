public class Persona{
    private int edad;
    private String nombre;

    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public void imprimirDatos(){
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }
}