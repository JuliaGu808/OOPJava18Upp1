/*
 * Java
 */
package husdjurdemo;

/**
 *
 * @author Julia
 */
public abstract class Husdjurshotell{
    private String name;
    private double vikt;
    
    public Husdjurshotell(String name, double vikt){
        this.name=name;
        this.vikt=vikt;
    }

//    @Override
//    public abstract double portion();
    
    
    public String getInfo(){
        return " name:  " + this.name + "\nVikt:  " + this.vikt + "(kg)";
    }

    public boolean match(String str){
        if(this.name.equalsIgnoreCase(str))
            return true;   
        return false;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVikt() {
        return vikt;
    }

    public void setVikt(double vikt) {
        this.vikt = vikt;
    }
    
}
