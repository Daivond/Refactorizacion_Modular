/**
 * Este es el programa que crea la composición del cono
 */
public class ProgramaComposicionCono {
    private static void imprimir (Object datos) {
        System.out.println(datos);
    }

    /**
     * Este es el programa que crea la composición del cono
     * @param args
     */
    public static void main (String[] args) {
        java.util.Random aleatorio = new java.util.Random();
        for (int i=1; i<=5; i++) {
            int radio = aleatorio.nextInt(9)+1;
            Cono cono = new Cono(0, 0, radio, i, "Azul");
            cono.imprimir();
        }
    }
}