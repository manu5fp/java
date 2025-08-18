/**
 * Ejemplo 10: Uso de clases internas
 * Repasa:
 * - Definición de una clase dentro de otra
 * - Acceso de la clase interna a atributos de la externa
 */
public class Ejemplo10_ClasesInternas {
    private String mensaje = "Hola desde Externa";

    class Interna {
        public void mostrarMensaje() {
            System.out.println("La interna accede: " + mensaje);
        }
    }

    public static void main(String[] args) {
        Ejemplo10_ClasesInternas externa = new Ejemplo10_ClasesInternas();
        Ejemplo10_ClasesInternas.Interna interna = externa.new Interna();
        interna.mostrarMensaje();
    }
}
