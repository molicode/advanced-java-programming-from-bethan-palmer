package methodreferencesexample;

/**
 * @author luis
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Square s = new Square(4);

        Shapes shapes = (Square square) -> {
            return square.calculateArea();
        };

        System.out.println("Area: " + shapes.getArea(s));

        Shapes shapes2 = (Square square) -> square.calculateArea();
        System.out.println("Area: " + shapes2.getArea(s));

        Shapes shapes3 = Square::calculateArea;
        System.out.println("Area: " + shapes3.getArea(s));
    }

}
