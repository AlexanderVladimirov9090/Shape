/**
 * Created on 06/03/16.
 * @author Alexander Vladimirov
 *         <alexandervladimirov1902@gmail.com>
 */
public class Tetrahedron extends ThreeDimensional {

    public Tetrahedron(double base , double height){
        super(base,height,0,"Tetrahedron");
    }

    @Override
    public double area(){
        return (Math.sqrt(3)/4)*Math.pow(this.x,2);
    }

    @Override
    public double volume(){
        return (x*x*y)/3;
    }
}
