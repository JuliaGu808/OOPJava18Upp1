/*
 * Java
 */

package fabrikdemo;
import javax.swing.*;


public class FabrikDemo {
    public FabrikDemo(){
        Husdjurshotell pet = new Husdjurshotell();
        pet.addDjur(new HusdjurHund("Sixten", 5));
        pet.addDjur(new HusdjurHund("Dogge", 5));
        pet.addDjur(new HusdjurKatt("Venus", 5));
        pet.addDjur(new HusdjurKatt("Ove", 3));
        pet.addDjur(new HusdjurOrm("Hypno", 1));
        String indata = JOptionPane.showInputDialog("Vilket djur ska få mat?");
        if(indata==null || indata.trim().equals(""))
            System.exit(0);
        JOptionPane.showMessageDialog(null, pet.matchInfo(indata));                        
    }
    
    public static void main(String[] args) {
        FabrikDemo husdjurHotell = new FabrikDemo();       
    }

}
