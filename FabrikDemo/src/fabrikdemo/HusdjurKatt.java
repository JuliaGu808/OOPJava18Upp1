/*
 * Java
 */
package fabrikdemo;

/**
 *
 * @author Julia
 */
public class HusdjurKatt extends Husdjur{
    protected String mat = super.kattMat;
    
    public HusdjurKatt(String name, double vikt){
        super(name, vikt);
    }

    @Override
    public double portion() {
        return Math.round(this.getVikt() * 1000 / 150) ; 
    }

    @Override
    public String getInfo() {
        return "Katten: " + super.getName() + "\nVikt: " + super.getVikt() + "(kg)"
                + "\nEat " + portion() + "(gram) " + mat;
    }
    
    
}
