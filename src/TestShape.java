/**
 * Created by putkanka on 06-Mar-16.
 */
public class TestShape {
    public static void main(String[] args) {
        Area circle = new Circle(13);
        Area square = new Square(4);
        Area triangle = new Triangle(12, 8);

        Volume sphere = new Sphere(13);
        Volume cube = new Cube(4);
        Volume tetrahedron = new Tetrahedron(150, 300);

        System.out.println(circle.area());
        System.out.println(square.area());
        System.out.println(triangle.area());
        System.out.println(sphere.area());
        System.out.println(sphere.volume());
        System.out.println(cube.area());
        System.out.println(cube.volume());
        System.out.println(tetrahedron.area());
        System.out.println(tetrahedron.volume());

    }

}
