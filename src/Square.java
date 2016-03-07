/**
 * Created by putkanka on 06-Mar-16.
 */
public class Square extends TwoDimensional {

    public Square(double length){
        super(length , "Square");
    }

    public double length(){
        return x();
    }

    @Override
    public double area(){
        return length()*length();
    }
}
