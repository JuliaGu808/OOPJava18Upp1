/*
 * Java
 */
package husdjurdemo;

/**
 *
 * @author Julia
 */
public class HusdjurHund extends Husdjur{
    public static final String MAT = "hundfoder";
    
    public HusdjurHund(String name, double vikt){
        super(name,vikt);
    }
    

    @Override
    public double portion() {
        return Math.round(super.getVikt() * 1000 / 100) ;        
    }
    
    @Override
    public String getInfo(){
        return "Hundens" + super.getInfo() + "\nVikt:  " + super.getVikt() + "(kg)"
                + "\nEat:  " + this.portion() + "(gram) " + this.MAT;
    }

}
