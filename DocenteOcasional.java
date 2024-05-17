

public class DocenteOcasional {
    int mesesContrato=10;
    double salarioMensual= 1300000;
    double especializacion;
    double maestria;
    double doctoral;

    // Constructor
    public DocenteOcasional(int mesesContrato, double salarioMensual) {
        this.mesesContrato = mesesContrato;
        this.salarioMensual = salarioMensual;
    }
    

    // Método para calcular el salario total
    public double calcularSalarioTotal() {
        double especializacion= mesesContrato*(3*salarioMensual);        
        double maestria= mesesContrato*(4*salarioMensual);
        double doctoral= mesesContrato*(5*salarioMensual);
        return 0;
    }
}