/**
 * Created by putkanka on 06-Mar-16.
 */
public class Triangle extends TwoDimensional{

    public Triangle(double base , double height){
        super(base,height,"Triangle");
    }

    public double base(){return x();}

    public double height(){return x();}

    @Override
    public double area(){return (height()*base())/2;}

}
