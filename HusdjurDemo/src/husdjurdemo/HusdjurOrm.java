/*
 * Java
 */
package husdjurdemo;

/**
 *
 * @author Julia
 */
public class HusdjurOrm extends Husdjur{
    public static final String MAT = "ormpellets";


    public HusdjurOrm(String name, double vikt) {
        super(name, vikt);
    }

    @Override
    public double portion() {
        return 20;
    }
 
    @Override
    public String getInfo(){
        return "Ormens" + super.getInfo() + "\nVikt:  " + super.getVikt() + "(kg)"
                + "\nEat:  " + this.portion() + "(gram) " + this.MAT;
    }

}
