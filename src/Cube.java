import java.util.Map;

/**
 * Created on 06/03/16.
 * @author Alexander Vladimirov
 *         <alexandervladimirov1902@gmail.com>
 */
public class Cube extends ThreeDimensional {

    public Cube(double length){
        super(length, length,length,"Cube");
    }

    @Override
    public double area(){return 6*Math.pow(x,2);}

     @Override
    public double volume(){
        return Math.pow(x,3);
    }

}
