import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Ejemplo 13: Lectura y escritura de ficheros con try-with-resources
 * Repasa:
 * - Manejo automático de recursos
 * - BufferedReader y FileWriter
 */
public class Ejemplo13_CopiarFichero {
    public static void main(String[] args) {
        try (
            BufferedReader br = new BufferedReader(new FileReader("entrada.txt"));
            FileWriter fw = new FileWriter("copia.txt");
        ) {
            String linea;
            while ((linea = br.readLine()) != null) {
                fw.write(linea + "\n");
            }
            System.out.println("Fichero copiado correctamente.");
        } catch (IOException e) {
            System.out.println("Error en la copia: " + e.getMessage());
        }
    }
}
