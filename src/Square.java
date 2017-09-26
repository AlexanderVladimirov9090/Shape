/**
 * Created on 06-Mar-16.
 * @author Alexander Vladimirov
 *         <alexandervladimirov1902@gmail.com>
 */
public class Square extends TwoDimensional {

    public Square(double length){
        super(length,length , "Square");
    }

    @Override
    public double area(){
        return x*x;
    }
}
