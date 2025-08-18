/**
 * Ejemplo 11: Enumeraciones
 * Repasa:
 * - Definición y uso de tipos enumerados
 * - Uso de switch con enums
 */
public class Ejemplo11_Enum {
    enum Dia { LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO }

    public static void main(String[] args) {
        Dia hoy = Dia.VIERNES;

        switch (hoy) {
            case LUNES:
                System.out.println("Ánimo, empieza la semana.");
                break;
            case VIERNES:
                System.out.println("¡Por fin viernes!");
                break;
            case SABADO: case DOMINGO:
                System.out.println("Fin de semana :)");
                break;
            default:
                System.out.println("Un día normal.");
        }
    }
}
