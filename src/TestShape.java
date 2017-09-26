/**
 * Created on 06-Mar-16.
 * @author Alexander Vladimirov
 *         <alexandervladimirov1902@gmail.com>
 */
public class TestShape {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[6];
        TwoDimensional circle = new Circle(13);
        TwoDimensional square = new Square(4);
        TwoDimensional triangle = new Triangle(12, 8);

        shapes[0] = circle;
        shapes[1] = square;
        shapes[2] = triangle;

        ThreeDimensional sphere = new Sphere(13);
        ThreeDimensional cube = new Cube(4);
        ThreeDimensional tetrahedron = new Tetrahedron(150, 300);

        shapes[3] = sphere;
        shapes[4] = cube;
        shapes[5] = tetrahedron;

        for (Shape shape : shapes) {
            if (shape instanceof TwoDimensional) {
                System.out.println("Area of " + shape.type() + " is: " + shape.area());
            } else if (shape instanceof ThreeDimensional) {
                System.out.println("Area of " + shape.type() + " is: " + shape.area() + "\n Volume of " + shape.type() + "is: " + ((ThreeDimensional) shape).volume());
            }
        }
    }
}
