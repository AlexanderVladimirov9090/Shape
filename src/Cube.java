import java.util.Map;

/**
 * Created by zumbaa on 06/03/16.
 */
public class Cube extends ThreeDimensional {

    public Cube(double length){
        super(length, "Cube");
    }

    public double length(){
        return x();
    }

    @Override
    public double area(){return 6*Math.pow(length(),2);}

    @Override
    public double volume(){
        return Math.pow(length(),3);
    }

}
