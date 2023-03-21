/**
Clase que recibe los datos de la clase PrismaMain y hace todos los calculos necesarios para saber las áreas
 **/
public class Prisma {
    private int baseTriangulo;
    private int alturaPrisma;

    public Prisma(int baseTriangulo, int alturaPrisma) {
        this.baseTriangulo = baseTriangulo;
        this.alturaPrisma = alturaPrisma;
    }

    public int getBaseTriangulo() {return baseTriangulo;}

    public void setBaseTriangulo(int baseTriangulo) {this.baseTriangulo = baseTriangulo;}

    public int getAlturaPrisma() {return alturaPrisma;}

    public void setAlturaPrisma(int alturaPrisma) {this.alturaPrisma = alturaPrisma;}

    /**
     * Aquí calcula la altura del triangulo sabiendo la base del mismo
     * @return altura del triángulo
     */
    public float alturaTriangulo() {
        float alturaTriangulo = (float) Math.sqrt(3)/2 * baseTriangulo;
        return alturaTriangulo;
    }

    /**
     * Aquí calcula la área de el triángulo a partir de la altura obtenida anteriormente
     * @return area de la base del triángulo
     */
    public float areaBase () {
        float alturaTriangulo = alturaTriangulo();
        float areaBase = (baseTriangulo * alturaTriangulo / 2);
        return areaBase;
    }

    /**
     * Aquí calcula el perímetro del prisma a partir de la base del triángulo
     * @return perímetro del prisma
     */
    public float perimetro () {
        float perimetro = 3 * baseTriangulo;
        return perimetro;
    }

    /**
     * Aquí calcula el Área lateral del prisma sabiendo la altura del prisma y el perímetro obtenido anteriormente
     * @return area lateral del prisma
     */
    public float areaLateral () {
        float perimetro = perimetro();
        float areaLateral = perimetro * alturaPrisma;
        return areaLateral;
    }

    /**
     * Y finalmente aquí se obtiene el Área total del prisma habiendo hecho todos los calculos anteriores
     * @return area total del prisma
     */
    public float areaTotal () {
        float areaBase = areaBase();
        float areaLateral = areaLateral();
        float areaTotal = 2 * areaBase + areaLateral;
        return areaTotal;
    }
}