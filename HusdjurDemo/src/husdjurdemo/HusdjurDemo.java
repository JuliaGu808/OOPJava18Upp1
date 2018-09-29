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
    
    public static void main(String[] args) {
      HusdjurDemo pet = new HusdjurDemo();
    }
}
