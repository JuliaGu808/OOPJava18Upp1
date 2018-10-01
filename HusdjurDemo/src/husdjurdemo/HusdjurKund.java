/*
 * Java
 */
package husdjurdemo;

/**
 *
 * @author Julia
 */
public class HusdjurKund extends Husdjurshotell implements Personal{
    protected int kundNr;

    public HusdjurKund(String name, int personNr){
        super(name);
        this.kundNr=personNr;
    }

    @Override
    public String roles() {
        return " Husdjurshotells kund\n";
    }

    public int getKundNr() {
        return kundNr;
    }

    public void setKundNr(int kundNr) {
        this.kundNr = kundNr;
    }
    
    @Override
    public String getInfo(){
        return  this.roles() + super.getInfo() +
                "\n kunds nummer: " + this.getKundNr();
    }
    
}
