/*
 * Java
 */
package husdjurdemo;
import java.util.*;

/**
 *
 * @author Julia
 */
public class Husdjur extends Husdjurshotell implements IHusdjur{
    private double vikt;
    
    protected List<HusdjurHund> hund = new ArrayList<>();
    protected List<HusdjurKatt> katt = new ArrayList<>();
    protected List<HusdjurOrm> orm = new ArrayList<>();
    
    public Husdjur(){}
    
    public Husdjur(String name, double vikt){
        super(name);
        this.vikt=vikt;
    }

    public double getVikt() {
        return vikt;
    }
   
    public void setVikt(double vikt) {
        this.vikt = vikt;
    }
    
    public void addHund(HusdjurHund h){
        hund.add(h);
    }
    
    
    public void addKatt(HusdjurKatt k){
        katt.add(k);
    }
    
    
    public void addOrm(HusdjurOrm o){
        orm.add(o);
    }
    
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

    public String containsDjur(String name){
        String s = "No matches";
        s = matchHund(name);
        if(s.equals("No matches"))
            s = matchKatt(name);
        if(s.equals("No matches"))
            s = matchOrm(name);
        return s;
    }
    

    @Override
    public double portion(){
        return 0;
    }
 
}
