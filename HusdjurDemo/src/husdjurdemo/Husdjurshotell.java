/*
 * Java
 */
package husdjurdemo;

/**
 *a superclass about pets hotel
 * class includes pets and persons informations
 * @author Julia
 */
public class Husdjurshotell{
    protected String name;  // common name for both pets and persons
    /**
     * default constructor
     */
    public Husdjurshotell(){}
    /**
     * constructor
     * @param name for tapping in the objects name
     */
    public Husdjurshotell(String name){
        this.name=name;
    }
    /**
     * method in order to show the objects information
     * @return String to show the sentence
     */
    public String getInfo(){
        return " name:  " + this.name;
    }
    /**
     * method for matching the objects name with the parameter
     * match method uses IgnoreCase to simplify the comparing
     * @param str write in the parameter
     * @return true or false
     */
    public boolean match(String str){
        if(this.name.equalsIgnoreCase(str))
            return true;   
        return false;
    }
    // getter
    public String getName() {
        return name;
    }
    // setter
    public void setName(String name) {
        this.name = name;
    }
    
}
