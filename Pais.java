
/**
 * Write a description of class Pais here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pais implements Measurable
{
    private int habitantes;
    
    public Pais(int hab){
        habitantes=hab;
    }
    public int getMedida(){
        return habitantes;
    }
}
