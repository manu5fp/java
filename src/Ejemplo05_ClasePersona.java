/**
 * Ejemplo 5: Clases y objetos
 * Repasa:
 * - Definición de una clase con atributos y métodos
 * - Creación de objetos con new
 */
public class Ejemplo05_ClasePersona {
    private String nombre;
    private int edad;

    public Ejemplo05_ClasePersona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void saludar() {
        System.out.println("Hola, soy " + nombre + " y tengo " + edad + " años.");
    }

    public static void main(String[] args) {
        Ejemplo05_ClasePersona persona = new Ejemplo05_ClasePersona("Ana", 25);
        persona.saludar();
    }
}
