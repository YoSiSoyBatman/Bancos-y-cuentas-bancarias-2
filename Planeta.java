
import java.util.ArrayList;
public class Planeta
{
    ArrayList <Pais> paises;
    
    public Planeta(){
        paises=new ArrayList <Pais>();
    }
    public void addPais(Pais mipais){
        paises.add(mipais);
    }
}
