/**
 * Ejemplo 4: Bucles
 * Repasa:
 * - Uso de for, while y do-while
 */
public class Ejemplo04_Bucles {
    public static void main(String[] args) {
        System.out.println("Bucle for:");
        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
        }

        System.out.println("Bucle while:");
        int j = 0;
        while (j < 5) {
            System.out.println("j = " + j);
            j++;
        }

        System.out.println("Bucle do-while:");
        int k = 0;
        do {
            System.out.println("k = " + k);
            k++;
        } while (k < 5);
    }
}
