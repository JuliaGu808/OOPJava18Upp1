/*
 * Java
 */
package husdjurdemo;

/**
 *
 * @author Julia
 */
public final class HusdjurKatt extends Husdjur{
    public static final String MAT = "kattfoder";
    

    public HusdjurKatt(String name, double vikt) {
        super(name, vikt);
    }

    @Override
    public double portion() {
        return Math.round(this.getVikt() * 1000 / 150) ;                
    }
    
    @Override
    public String getInfo(){
        return "Kattens" + super.getInfo() + "\nVikt: " + super.getVikt() + "(kg)"
               + "\nEat:  " + this.portion() + "(gram) " + this.MAT;
    }    

}
