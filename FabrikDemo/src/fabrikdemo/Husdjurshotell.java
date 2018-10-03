/*
 * Java
 */
package fabrikdemo;
import java.util.*;

/**
 *It is a factory class to deal with the list
 * @author Julia
 */
public class Husdjurshotell {
    List<Husdjur> djur = new ArrayList<>(); // create a list
    /**
     * method add each pets
     * get use of the list method add
     * @param husdjur a super class which has three subclasses
     */
    public void addDjur(Husdjur husdjur){
        djur.add(husdjur);
    }
    
    public List<Husdjur> getDjur(){
        return djur;
    }
    /**
     * a method to search pets information by the name
     * get use of the list to search each pets name 
     * which is the same with the searching name in the list 
     * @param str pets name
     * @return pets information
     */
    public String matchInfo(String str){
        String s = "No matches";
        for(Husdjur h: djur){
            if(h.getName().equalsIgnoreCase(str))
                s = h.getInfo();
        }
        return s;
    }
}
