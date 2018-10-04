/*
 * Java
 */
package fabrikdemo;
import fabrikdemo.Husdjur.Mat;


/**
 *the subclass about dog
 * @author Julia
 */
public class HusdjurHund extends Husdjur{
    protected String mat = Mat.HUND.getMat();
    
    public HusdjurHund(String name, double vikt){
        super(name, vikt);      
    }

    @Override
    public double portion() {
        return Math.round(super.getVikt() * 1000 / 100) ; 
    }
    
    @Override
    public String getInfo(){
        return "Hunden: " + super.getName() + "\nVikt: " + super.getVikt() + "(kg)"
                + "\nEat " + portion() + "(gram) " + mat;
    }
}
