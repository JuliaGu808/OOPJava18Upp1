/*
 * Java
 */
package husdjurdemo;

/**
 *
 * @author Julia
 */
public class HusdjurHund extends Husdjurshotell implements IHusdjur{
    protected double vikt;
    public static final String MAT = "hundfoder";
    
    public HusdjurHund(String name, double vikt){
        super(name);
        this.vikt=vikt;
    }

    @Override
    public double portion() {
        return Math.round(this.getVikt() * 1000 / 100) ;        
    }
    
    @Override
    public String getInfo(){
        return "Hundens" + super.getInfo() + "\nVikt:  " + this.vikt + "(kg)"
                + "\nEat:  " + this.portion() + "(gram) " + this.MAT;
    }
    
    public double getVikt() {
        return vikt;
    }

    public void setVikt(double vikt) {
        this.vikt = vikt;
    }
}
