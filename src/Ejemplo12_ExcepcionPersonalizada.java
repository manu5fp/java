/**
 * Ejemplo 12: Excepciones personalizadas
 * Repasa:
 * - Definición de una clase que hereda de Exception
 * - Uso de throw y try-catch
 */
class EdadInvalidaException extends Exception {
    public EdadInvalidaException(String mensaje) {
        super(mensaje);
    }
}

public class Ejemplo12_ExcepcionPersonalizada {
    public static void verificar(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("Edad fuera de rango válido.");
        }
        System.out.println("Edad válida: " + edad);
    }

    public static void main(String[] args) {
        try {
            verificar(25);
            verificar(-5); // lanzará la excepción
        } catch (EdadInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
