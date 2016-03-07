/**
 * Created by putkanka on 06-Mar-16.
 */
public class Shape implements Calculate {
    protected String shapeType;

    public Shape(String type){
        this.shapeType = type;
    }

    public String shapeType(){
        return shapeType;
    }


    @Override
    public double area() {
        return 0;
    }

    @Override
    public double volume() {
        return 0;
    }

    @Override
    public boolean isTwoDimensional() {
        return false;
    }

    @Override
    public boolean isThreeDimensional() {
        return false;
    }
}
