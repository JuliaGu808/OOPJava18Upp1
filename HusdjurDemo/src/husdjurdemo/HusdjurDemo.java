/*
 * Java
 */

package husdjurdemo;
import javax.swing.*;
import java.util.*;


public class HusdjurDemo {
    public HusdjurDemo(){        
        
        Husdjur djur = new Husdjur();
       
        djur.addHund(new HusdjurHund("Sixten", 5));
        djur.addHund(new HusdjurHund("Dogge", 5));
        djur.addKatt(new HusdjurKatt("Venus", 5));
        djur.addKatt(new HusdjurKatt("Ove", 3));
        djur.addOrm(new HusdjurOrm("Hypno", 1));
        // to add extra husdjur
        djur.addOrm(new HusdjurOrm("Nikolas", 1.5));
        djur.addHund(new HusdjurHund("Muffin", 6.5));
        djur.addKatt(new HusdjurKatt("Cindy", 4.5));
        djur.addOrm(new HusdjurOrm("Banto", 1.5));
           
        String test = JOptionPane.showInputDialog("Djurs name ?");
        if(test == null || test.trim().equals(""))
            System.exit(0);
        else
            JOptionPane.showMessageDialog(null, djur.containsDjur(test));
        }
 
    // to add extra class for search person
    public static void searchP(){
         Personal[] human = new Personal[5];
         human[0] = new HusdjurServer("David", 1001);
         human[1] = new HusdjurServer("Mary", 1002);
         human[2] = new HusdjurKund("Emma", 9001);
         human[3] = new HusdjurKund("Tom", 9002);
         human[4] = new HusdjurKund("Olive", 9003); 
         
         Husdjurshotell person = null;
         
         String s = JOptionPane.showInputDialog("Persons name ?");
        if(s == null || s.trim().equals(""))
            System.exit(0);
        for(int i=0; i<5; i++){
            person = (Husdjurshotell) human[i];
            if(person.match(s)){
                JOptionPane.showMessageDialog(null, person.getInfo());
                break;
            }            
        }
        if(person.match(s)==false)
            JOptionPane.showMessageDialog(null, "No matches.");  
    }
    
    public static void main(String[] args) {
      HusdjurDemo pet = new HusdjurDemo();
      searchP();
    }
}


