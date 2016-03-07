/**
 * Created by putkanka on 06-Mar-16.
 */
public class Shape implements Area, Volume {
    protected String shapeType;

    public Shape(String type){
        this.shapeType = type;
    }

    public String shapeType(){
        return shapeType;
    }

    public boolean isTwoDimensional() {
        return false;
    }


    public boolean isThreeDimensional() {
        return false;
    }
  @Override
    public double area() {
        return 0;
    }

    @Override
    public double volume() {
        return 0;
    }
}


