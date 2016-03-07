/**
 * Created by zumbaa on 06/03/16.
 */
public class Tetrahedron extends ThreeDimensional {

    public Tetrahedron(double base , double height){
        super(base,height,"Tetrahedron");
    }

    public double base(){
        return x();
    }

    public double height(){
        return y();
    }

    @Override
    public double area(){
        return (Math.sqrt(3)/4)*Math.pow(base(),2);
    }

    @Override
    public double volume(){
        return (1/3)*base()*base()*height();
    }
}
