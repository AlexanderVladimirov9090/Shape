/**
 * Created on 06-Mar-16.
 * @author Alexander Vladimirov
 *         <alexandervladimirov1902@gmail.com>
 */
public class Triangle extends TwoDimensional{

    public Triangle(double base , double height){
        super(base,height,"Triangle");
    }

    @Override
    public double area(){return (this.x*this.y)/2;}

}
