/*
 * Java
 */
package husdjurdemo;

/**
 *class extends Husdjurshotell and implements interface Personal
 * @author Julia
 */
public class HusdjurServer extends Husdjurshotell implements Personal{
    private int serverNr;   // persons character person number
    /**
     * constructor to create different server
     * @param name servers name
     * @param serverNr servers number
     */
    public HusdjurServer(String name, int serverNr){
        super(name);
        this.serverNr=serverNr;
    }
    /**
     * method from interface to rewrite the role method
     * @return roles information
     */
    @Override
    public String roles() {
        return " Husdjurshotells server\n";
    }
    /**
     * method from superclass to rewrite getInfo method to show servers information
     * @return 
     */
    @Override
    public String getInfo(){
        return  this.roles() + super.getInfo() +
                "\n servers nummer: " + this.getServerNr();
    }
    // getter
    public int getServerNr() {
        return serverNr;
    }
    // setter
    public void setServerNr(int serverNr) {
        this.serverNr = serverNr;
    }
    
    
}
