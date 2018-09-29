/*
 * Java
 */
package husdjurdemo;

/**
 *
 * @author Julia
 */
public class HusdjurOrm extends Husdjurshotell implements IHusdjur{
    protected double vikt;
    public static final String MAT = "ormpellets";


    public HusdjurOrm(String name, double vikt) {
        super(name);
        this.vikt=vikt;
    }

    @Override
    public double portion() {
        return 20;
    }
 
    @Override
    public String getInfo(){
        return "Ormens" + super.getInfo() + "\nVikt:  " + this.vikt + "(kg)"
                + "\nEat:  " + this.portion() + "(gram) " + this.MAT;
    }
    
    public double getVikt() {
        return vikt;
    }

    public void setVikt(double vikt) {
        this.vikt = vikt;
    }
    
}
