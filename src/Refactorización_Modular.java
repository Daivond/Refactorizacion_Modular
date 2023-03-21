import java.util.Scanner;

public class Refactorización_Modular {

    static Scanner key = new Scanner(System.in);

    public static float LeerValor() {
        float valor = 0;
        boolean leer = false;
        do {
            try {
                valor = Float.parseFloat(key.nextLine());
                leer = true;
            } catch (NumberFormatException x) {
                System.out.println("El valor introducido no es correcto, introduzca otro por favor: ");
            }
        } while (!leer);
        return valor;
    }
    public static void ImprimirValor(String valor) {
        System.out.println(valor);
    }
    public static boolean EsNumpero(String valor) {
        try {
            Float.parseFloat(valor);
            return true;
        } catch (NumberFormatException x) {
            return false;
        }
    }
    public static float AlturaTriangulo(float BaseTriangulo) {
        float AlturaTriangulo = (float) Math.sqrt(3)/2 * BaseTriangulo;
        System.out.println("La altura es: " + AlturaTriangulo);
        return AlturaTriangulo;
    }
    public static float AreaBase (float BaseTriangulo, float AlturaTriangulo) {
        float AreaBase = (BaseTriangulo * AlturaTriangulo / 2);
        return AreaBase;
    }
    public static float Perimetro (float BaseTriangulo) {
        float Perimetro = 3 * BaseTriangulo;
        return Perimetro;
    }
    public static float AreaLateral (float Perimetro, float AlturaPrisma) {
        float AreaLateral = Perimetro * AlturaPrisma;
        return AreaLateral;
    }
    public static float AreaTotal (float AreaBase, float AreaLateral) {
        float AreaTotal = 2 * AreaBase + AreaLateral;
        return AreaTotal;
    }

    public static void main(String[] args) {
        ImprimirValor("Introduce la base del triangulo: ");
        float Base = LeerValor();
        float Altura = AlturaTriangulo(Base);
        float AreaBase = AreaBase(Base, Altura);
        ImprimirValor("Introduce la altura del prisma: ");
        float Prisma = LeerValor();
        float Perimetro = Perimetro(Base);
        float AreaLateral = AreaLateral(Perimetro, Prisma);
        float AreaTotal = AreaTotal(AreaLateral, AreaBase);
        ImprimirValor("El área total es: " + AreaTotal);
    }
}