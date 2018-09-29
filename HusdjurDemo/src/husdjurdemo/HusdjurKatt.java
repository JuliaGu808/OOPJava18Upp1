/*
 * Java
 */
package husdjurdemo;

/**
 *
 * @author Julia
 */
public class HusdjurKatt extends Husdjurshotell implements IHusdjur{
    protected double vikt;
    public static final String MAT = "kattfoder";
    

    public HusdjurKatt(String name, double vikt) {
        super(name);
        this.vikt=vikt;
    }

    @Override
    public double portion() {
        return Math.round(this.getVikt() * 1000 / 150) ;                
    }
    
    @Override
    public String getInfo(){
        return "Kattens" + super.getInfo() + this.vikt + "(kg)"
               + "\nEat:  " + this.portion() + "(gram) " + this.MAT;
    }    
    
    public double getVikt() {
        return vikt;
    }

    public void setVikt(double vikt) {
        this.vikt = vikt;
    }
}
