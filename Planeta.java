
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
    public float calcularProm(){
        int i=0;
        float ret=0;
        for(Pais p:paises){
            ret+=p.getMedida();
            i++;
        }
        ret/=i;
        return ret;
    }
}
