/**
 * Ejemplo 6: Atributos y métodos estáticos
 * Repasa:
 * - Diferencia entre atributos de clase (static) y de objeto
 * - Contadores estáticos
 */
public class Ejemplo06_Static {
    private static int contadorObjetos = 0;
    private String nombre;

    public Ejemplo06_Static(String nombre) {
        this.nombre = nombre;
        contadorObjetos++;
    }

    public static int getContadorObjetos() {
        return contadorObjetos;
    }

    public static void main(String[] args) {
        Ejemplo06_Static a = new Ejemplo06_Static("Uno");
        Ejemplo06_Static b = new Ejemplo06_Static("Dos");

        System.out.println("Objetos creados: " + Ejemplo06_Static.getContadorObjetos());
    }
}
