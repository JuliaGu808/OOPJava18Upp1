/*
 * Java
 */

package husdjurdemo;
import javax.swing.*;


public class HusdjurDemo {
    public HusdjurDemo(){
        IHusdjur[] p = new IHusdjur[5];
        p[0] = new HusdjurHund("Sixten", 5);
        p[1] = new HusdjurHund("Dogge", 10);
        p[2] = new HusdjurKatt("Venus", 5);
        p[3] = new HusdjurKatt("Ove", 3);
        p[4] = new HusdjurOrm("Hypno", 1);
        
        Husdjurshotell husdjur = null;
        
        String s = JOptionPane.showInputDialog("Djurs name ?");
        if(s == null || s.trim().equals(""))
            System.exit(0);
        for(int i=0; i<5; i++){
            husdjur = (Husdjurshotell) p[i];
            if(husdjur.match(s)){
                JOptionPane.showMessageDialog(null, husdjur.getInfo());
                break;
            }            
        }
        if(husdjur.match(s)==false)
            JOptionPane.showMessageDialog(null, "No matches.");            
    }
    
    public static void searchP(){
         Personal[] human = new Personal[5];
         human[0] = new HusdjurServer("David", 1001);
         human[1] = new HusdjurServer("Mary", 1002);
         human[2] = new HusdjurKund("Cindy", 9001);
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

// next List , seperate pet ang person system
