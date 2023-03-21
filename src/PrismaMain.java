import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
Clase que genera 3 bases de triángulo y 3 alturas de prisma aleatorias y accediendo a la clase Prisma calcula
las áreas de cada uno, posteriormente las ordena y las muestra por pantalla junto con sus alturas y bases
 **/
public class PrismaMain {

    public static void main(String[] args) {
        Random rand = new Random();

        ArrayList<Prisma> prismas = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            int baseTriangulo = rand.nextInt(10) + 1;
            int alturaPrisma = rand.nextInt(10) + 1;
            Prisma prisma = new Prisma(baseTriangulo, alturaPrisma);
            prismas.add(prisma);
        }

        Collections.sort(prismas, (p1, p2) -> Float.compare(p2.areaTotal(), p1.areaTotal()));
        System.out.println("//////////////////////////");
        System.out.println("CREACIÓN DE OBJETOS PRISMA");
        System.out.println("//////////////////////////");

        for (Prisma prisma : prismas) {
            System.out.println("Creado el objeto prisma con: ");
            System.out.println("Base triangulo: "+prisma.getBaseTriangulo() );
            System.out.println("Altura prisma: "+prisma.getAlturaPrisma());
            System.out.println("Área total del prisma: "+prisma.areaTotal());
            System.out.println("---------------------------------");
        }
    }
}