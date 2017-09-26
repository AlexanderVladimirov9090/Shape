/**
 * Created on 06-Mar-16.
 * @author Alexander Vladimirov
 *         <alexandervladimirov1902@gmail.com>
 */
public class Shape {
    protected String shapeType;

    public Shape(String type) {
        this.shapeType = type;
    }

    public String type() {
        return shapeType;
    }

    public double area() {
        return 0;
    }
}


