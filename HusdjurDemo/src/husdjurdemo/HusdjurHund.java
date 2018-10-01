/*
 * Java
 */
package husdjurdemo;

/**
 *subclass about dogs 
 * defined final class in order to prevent this class to be inherited
 * otherwise there will be a little complicated to have many subclasses
 * @author Julia
 */
public final class HusdjurHund extends Husdjur{
    // final variabel cannot change dogs food
    public static final String MAT = "hundfoder";   
    /**
     * constructor to create a dogs character
     * @param name
     * @param vikt 
     */
    public HusdjurHund(String name, double vikt){
        super(name,vikt);
    }
    /**
     * method override from superclass to rewrite the method
     * @return double dogs foods portion
     */
    @Override
    public double portion() {
        return Math.round(super.getVikt() * 1000 / 100) ;        
    }
    /**
     * method override from super super class to complete all this dogs information
     * @return String dogs information
     */
    @Override
    public String getInfo(){
        return "Hundens" + super.getInfo() + "\nVikt:  " + super.getVikt() + "(kg)"
                + "\nEat:  " + this.portion() + "(gram) " + this.MAT;
    }

}
