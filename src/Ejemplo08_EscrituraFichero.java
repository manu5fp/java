import java.io.FileWriter;
import java.io.IOException;

/**
 * Ejemplo 8: Escritura de ficheros de texto
 * Repasa:
 * - Uso de FileWriter
 * - Escritura de líneas
 */
public class Ejemplo08_EscrituraFichero {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("salida.txt")) {
            fw.write("Primera línea\n");
            fw.write("Segunda línea\n");
            System.out.println("Fichero escrito correctamente.");
        } catch (IOException e) {
            System.out.println("Error al escribir el fichero: " + e.getMessage());
        }
    }
}
