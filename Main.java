
public class Main {
    public static void main(String[] args) {
        
        DocenteCatedra auxiliar = new DocenteCatedra();
        DocenteCatedra asistente = new DocenteCatedra(); 
        DocenteCatedra asociado = new DocenteCatedra(); 

        //salarios docentes de catedra
        double salarioAuxiliar = auxiliar.calcularSalarioMensual();
        double salarioAsistente = asistente.calcularSalarioMensual();
        double salarioAsociado = asociado.calcularSalarioMensual();

        
        System.out.println("Salario mensual de Auxiliar: $" + salarioAuxiliar);
        System.out.println("Salario mensual de Asistente: $" + salarioAsistente);
        System.out.println("Salario mensual de Asociado: $" + salarioAsociado);
        
        
        

        // docentes ocasionales
        
        
        calcularSalarioTotal especializacion = new calcularSalarioTotal(); 
        calcularSalarioTotal maestria = new calcularSalarioTotal(); 
        calcularSalarioTotal doctorado = new calcularSalarioTotal(); 

        // salarios de docentes ocasionales
        double salarioEspecializacion = especializacion.calcularSalarioTotal();
        double salarioMaestria = maestria.calcularSalarioTotal();
        double salarioDoctorado = doctorado.calcularSalarioTotal();

        System.out.println("Salario de especialización: $" + salarioEspecializacion);
        System.out.println("Salario de maestría: $" + salarioMaestria);
        System.out.println("Salario de doctorado: $" + salarioDoctorado);
    }
}
