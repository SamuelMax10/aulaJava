import model.entities.AbstractShape;
import model.entities.Circle;
import model.entities.Rectangle;
import model.enums.Color;

public class Main {
    public static void main(String[] args) {


        AbstractShape s1 = new Circle(Color.BLACK, 2.0);
        AbstractShape s2 = new Rectangle(Color.WHITE, 3.0, 4.0);

        System.out.println("Cor do circulo: " + s1.getColor());
        System.out.println("Área do circulo: " + s1.area());
        System.out.println("Cor do retangulo: " + s2.getColor());
        System.out.println("Área do retangulo: " + s2.area());
    }
}