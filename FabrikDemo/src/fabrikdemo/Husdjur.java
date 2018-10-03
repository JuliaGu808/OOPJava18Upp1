/*
 * Java
 */
package fabrikdemo;

/**
 *a super class to different pets
 * @author Julia
 */
public abstract class Husdjur implements IDjur{

    protected enum Mat{
        HUND("hundfoder"), KATT("kattfoder"), ORM("ormfoder");
        public final String djurmat;
        Mat(String str){
            djurmat=str;
        }
    }
    private String name;
    private double vikt;
    
    protected String hundMat = Mat.HUND.djurmat;
    protected String kattMat = Mat.KATT.djurmat;
    protected String ormMat = Mat.ORM.djurmat;
    
    public Husdjur(String name, double vikt){
        this.name=name;
        this.vikt=vikt;
    }
    
    @Override
    public abstract double portion();
    public abstract String getInfo();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getVikt() {
        return vikt;
    }

    public void setVikt(double vikt) {
        this.vikt = vikt;
    }
    
}
