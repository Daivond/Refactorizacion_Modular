//Clase que representa un objeto Círculo en un plano bidimensional cartesiano
public class Circulo {
    private float x, y;
    private float radio;

    //Creamos el objeto círculo con las coordenadas y radio especificados
    public Circulo (float cX, float cY, float r) { // constructor
        this.x = cX;
        this.y = cY;
        this.radio = r;
    }

    //Ahora establecemos las coordenadas "x" e "y" y las devolvemos, asi como el radio
    public float getX() { return x; }
    public void setX(float x) { this.x = x; }
    public float getY() { return y; }
    public void setY(float y) { this.y = y; }
    public float getRadio() { return radio; }
    public void setRadio(float radio) { this.radio = radio; }
    public float area() { return (float)Math.PI*radio*radio; }

    //Imprime los detalles del círculo creado
    public void imprimir () {
        System.out.print(" x=" + x);
        System.out.print(" y=" + y);
        System.out.print(" r=" + radio);
        System.out.print(" A=" + area());
    }
}