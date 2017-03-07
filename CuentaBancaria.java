

public class CuentaBancaria implements Measurable
{
    private int saldo;
    
    public CuentaBancaria(int sal){
        saldo=sal;
    }
    public int getMedida(){
        return saldo;
    }
}
