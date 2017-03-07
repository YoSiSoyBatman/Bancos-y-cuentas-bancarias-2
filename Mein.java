

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
        
        Planeta pla=new Planeta();
        Pais p1=new Pais(25);
        Pais p2=new Pais(32);
        Pais p3=new Pais(94);
        pla.addPais(p1);
        pla.addPais(p2);
        pla.addPais(p3);
        System.out.println("Saldo promedio="+chair.calcularGraduacion()+" y promedio de habitantes=" +pla.calcularProm());
    }
}
