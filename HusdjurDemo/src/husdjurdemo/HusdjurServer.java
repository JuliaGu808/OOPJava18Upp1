/*
 * Java
 */
package husdjurdemo;

/**
 *
 * @author Julia
 */
public class HusdjurServer extends Husdjurshotell implements Personal{
    private int serverNr;
    
    public HusdjurServer(String name, int serverNr){
        super(name);
        this.serverNr=serverNr;
    }

    @Override
    public String roles() {
        return "Husdjurshotells server, ";
    }
    
    @Override
    public String getInfo(){
        return  this.roles() + super.getInfo() +
                "\nServers nummer: " + this.getServerNr();
    }

    public int getServerNr() {
        return serverNr;
    }

    public void setServerNr(int serverNr) {
        this.serverNr = serverNr;
    }
    
    
}
