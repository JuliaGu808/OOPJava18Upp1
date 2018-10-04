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
    List<IDjur> djur = new ArrayList<>();
    
    /**
     * method add each pets
     * get use of the list method add
     * @param husdjur an interface classes object which implemented 
     * by a super class which has three subclasses
     */
    public void addDjur(IDjur husdjur){
        djur.add(husdjur);
    }
    
    public List<IDjur> getDjur(){
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
        for(IDjur h: djur){
            Husdjur pets = (Husdjur)h;  // change interface pets to the superclass
            if(pets.getName().equalsIgnoreCase(str))
                s = pets.getInfo();
        }
        return s;
    }
}
