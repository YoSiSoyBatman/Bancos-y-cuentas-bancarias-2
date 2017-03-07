
import java.util.ArrayList;
public class Banco
{
    private ArrayList <CuentaBancaria> bancs; 
    public Banco(){
        bancs=new ArrayList <CuentaBancaria>();
    }
    public void addCuenta(CuentaBancaria cuent){
        bancs.add(cuent);
    }
    float calcularGraduacion(){
        float ret=0;
        int i=0;
        for(CuentaBancaria cuetemp:bancs){
            i++;
            ret+=cuetemp.getMedida();
        }
        ret/=i;
        return ret;
    }
}
