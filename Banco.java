
import java.util.ArrayList;
public class Banco
{
    ArrayList <CuentaBancaria> bancs;
    
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
            ret+=cuetemp.getSaldo();
        }
        ret/=i;
        return ret;
    }
}
