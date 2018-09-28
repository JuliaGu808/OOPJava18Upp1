/*
 * Java
 */
package husdjurdemo;

/**
 *
 * @author Julia
 */
public class HusdjurKatt extends Husdjurshotell{
    public static final String MAT = "kattfoder";
    

    public HusdjurKatt(String name, double vikt) {
        super(name, vikt);
    }

    @Override
    public double portion() {
        return super.getVikt() * 1000 / 150;                
    }
    
    @Override
    public String getInfo(){
        return "Kattens" + super.getInfo() +
                "\nEat " + this.portion() + "gram " + this.MAT;
    }    
    
}
