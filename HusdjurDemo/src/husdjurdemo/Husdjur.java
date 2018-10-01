/*
 * Java
 */
package husdjurdemo;
import java.util.*;

/**
 *class extends Husdjurshotell and implements interface IHusdjur
 * @author Julia
 */
public class Husdjur extends Husdjurshotell implements IHusdjur{
    protected double vikt;    // pets unik character 
    // use ArrayList for different kinds of pets and can let add action more easy
    protected List<HusdjurHund> hund = new ArrayList<>();
    protected List<HusdjurKatt> katt = new ArrayList<>();
    protected List<HusdjurOrm> orm = new ArrayList<>();
    /**
     * default constructor which can help create an object easily
     */
    public Husdjur(){}
    /**
     * a defined constructor which can help add pets information
     * @param name
     * @param vikt 
     */
    public Husdjur(String name, double vikt){
        super(name);
        this.vikt=vikt;
    }
    //getter
    public double getVikt() {
        return vikt;
    }
    // setter
    public void setVikt(double vikt) {
        this.vikt = vikt;
    }
    /**
     * method which can get use of ArrayLists add method
     * @param h an object, like dog, cat and snake
     */
    public void addHund(HusdjurHund h){
        hund.add(h);
    }
    
    
    public void addKatt(HusdjurKatt k){
        katt.add(k);
    }
    
    
    public void addOrm(HusdjurOrm o){
        orm.add(o);
    }
    /**
     * method to compare with the parameter to find the exact pets information
     * in the method, use the super class match method
     * write the same method structure for different pets an protected method
     * 
     * @param str pets name
     * @return pets information
     * use another method to call these three method
     */
    protected String matchHund(String str){
        String s = "No matches";
        for(HusdjurHund h: hund){
            if(h.match(str)){
                s = h.getInfo();
            }
        }
        return s;
    }
    
    protected String matchKatt(String str){
        String s = "No matches";
        for(HusdjurKatt k: katt){
            if(k.match(str)){
                s = k.getInfo();
            }
        }
        return s;
    }
    
    protected String matchOrm(String str){
        String s = "No matches";
        for(HusdjurOrm o: orm){
            if(o.match(str)){
                s = o.getInfo();
            }
        }
        return s;
    }
    /**
     * method to call three pets match method 
     * @param name pets name
     * @return the right ones information
     */
    public String containsDjur(String name){
        String s = "No matches";
        s = matchHund(name);
        if(s.equals("No matches"))
            s = matchKatt(name);
        if(s.equals("No matches"))
            s = matchOrm(name);
        return s;
    }
    
    /**
     * method from interface IHusdjur
     * @return 0
     * nothing because this method need its subclass to override it
     * and write theirs unik code
     */
    @Override
    public double portion(){
        return 0;
    }
 
}
