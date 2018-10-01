/*
 * Java
 */
package husdjurdemo;

/**
 *
 * @author Julia
 */
public class Husdjurshotell{
    protected String name;
    
    public Husdjurshotell(){}
    
    public Husdjurshotell(String name){
        this.name=name;
    }
    
    public String getInfo(){
        return " name:  " + this.name;
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
    
}
