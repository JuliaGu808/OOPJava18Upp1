/*
 * Java
 */
package fabrikdemo;

/**
 *
 * @author Julia
 */
public class HusdjurOrm extends Husdjur{
    protected String mat = super.ormMat;
    
    public HusdjurOrm(String name, double vikt){
        super(name, vikt);
    }

    @Override
    public double portion() {
        return 20;
    }

    @Override
    public String getInfo() {
        return "Ormen: " + super.getName() + "\nVikt: " + super.getVikt() + "(kg)"
                + "\nEat " + portion() + "(gram) " + mat;
    }
    
    
    
}
