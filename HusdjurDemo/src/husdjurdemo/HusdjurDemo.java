/*
 * Java
 */

package husdjurdemo;
import javax.swing.*;
import java.util.*;


public class HusdjurDemo {
    /**
     * constructor to call the program
     */
    public HusdjurDemo(){        
        // create an object about pets
        Husdjur djur = new Husdjur();
       // in this pets to add different animals
        djur.addHund(new HusdjurHund("Sixten", 5));
        djur.addHund(new HusdjurHund("Dogge", 5));
        djur.addKatt(new HusdjurKatt("Venus", 5));
        djur.addKatt(new HusdjurKatt("Ove", 3));
        djur.addOrm(new HusdjurOrm("Hypno", 1));
        // ArrayList can help to add extra anmials
        djur.addOrm(new HusdjurOrm("Nikolas", 1.5));
        djur.addHund(new HusdjurHund("Muffin", 6.5));
        djur.addKatt(new HusdjurKatt("Cindy", 4.5));
        djur.addOrm(new HusdjurOrm("Banto", 1.5));
           
        String test = JOptionPane.showInputDialog("Vilket djur ska få mat?");
        if(test == null || test.trim().equals(""))
            System.exit(0);
        else
            JOptionPane.showMessageDialog(null, djur.containsDjur(test));
        }
 
    // to add extra class for search person
    public static void searchP(){
        // create an array object about person in super class
        Husdjurshotell[] person = new Husdjurshotell[5];
        // set different people
         person[0] = new HusdjurServer("David", 1001);
         person[1] = new HusdjurServer("Mary", 1002);
         person[2] = new HusdjurKund("Emma", 9001);
         person[3] = new HusdjurKund("Tom", 9002);
         person[4] = new HusdjurKund("Olive", 9003); 
         
         
         String s = JOptionPane.showInputDialog("Persons name ?");
        if(s == null || s.trim().equals(""))
            System.exit(0);
        String indata = null;
        for(int i=0; i<5; i++){
            if(person[i].match(s)){
                indata = person[i].getInfo();
                JOptionPane.showMessageDialog(null, indata);
                break;
            }            
        }
        if(indata==null)
            JOptionPane.showMessageDialog(null, "No matches.");  
    }
    
    public static void main(String[] args) {
        // call the main program
      HusdjurDemo pet = new HusdjurDemo();
      searchP();
    }
}


