import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Ejemplo 7: Lectura de ficheros de texto
 * Repasa:
 * - Uso de FileReader y BufferedReader
 * - Lectura línea a línea
 */
public class Ejemplo07_LecturaFichero {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("entrada.txt"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el fichero: " + e.getMessage());
        }
    }
}
