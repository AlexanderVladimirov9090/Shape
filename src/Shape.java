/**
 * Created by putkanka on 06-Mar-16.
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


