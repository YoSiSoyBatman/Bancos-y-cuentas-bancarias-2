

public class Mein
{
    public static void main(String [] args){
        Banco chair=new Banco();
        CuentaBancaria c1=new CuentaBancaria(100);
        CuentaBancaria c2=new CuentaBancaria(200);
        CuentaBancaria c3=new CuentaBancaria(300);
        chair.addCuenta(c1);
        chair.addCuenta(c2);
        chair.addCuenta(c3);
        System.out.println(chair.calcularGraduacion());
    }
}
