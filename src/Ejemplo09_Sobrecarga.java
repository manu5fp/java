/**
 * Ejemplo 9: Sobrecarga de métodos
 * Repasa:
 * - Definir varios métodos con el mismo nombre
 * - Diferenciación por número y tipo de parámetros
 */
public class Ejemplo09_Sobrecarga {
    public int sumar(int a, int b) {
        return a + b;
    }

    public double sumar(double a, double b) {
        return a + b;
    }

    public int sumar(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Ejemplo09_Sobrecarga calc = new Ejemplo09_Sobrecarga();
        System.out.println("Suma int: " + calc.sumar(2, 3));
        System.out.println("Suma double: " + calc.sumar(2.5, 3.5));
        System.out.println("Suma 3 enteros: " + calc.sumar(1, 2, 3));
    }
}
