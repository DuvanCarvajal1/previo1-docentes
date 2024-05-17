public class DocenteCatedra {
    int experiencia; 
    int horasCatedra;
    double valorHoraCatedra;
    
    String titular, asociado, asistente  , auxiliar;

    // Constructor
    public DocenteCatedra(int experiencia, int horasCatedra, double valorHoraCatedra,String titular, String asociado, String asistente, String auxiliar) {
        this.experiencia = experiencia;
        this.horasCatedra = horasCatedra;
        this.valorHoraCatedra = valorHoraCatedra;
        this.titular = titular;
        this.asociado = asociado;
        this.asistente = asistente;
        this.auxiliar = auxiliar;
    }
    

   
    // categoría del docente 
    public String determinarCategoria() {
        if (experiencia >= 8) {
            return "Profesor Titular";
        } else if (experiencia >= 6) {
            return "Profesor Asociado";
        } else if (experiencia >= 4) {
            return "Profesor Asistente";
        } else if (experiencia >= 2) {
            return "Profesor Auxiliar";
        } else {
            return "Categoría no determinada";
        }
        
    }

    
    //  calcular el salario mensual
    public double calcularSalarioMensual() {
        if(determinarCategoria() == "Profesor Asociado") {
            double salarioAsociado = 50000*horasCatedra;
        }else if(determinarCategoria() == "Profesor Asistente") {
            double salarioAsistente = 45000*horasCatedra;
        }else if(determinarCategoria() == "Profesor Auxiliar") {
            double salarioAuxiliar = 40000*horasCatedra;
        }
        return 0;
    }
      }
        
        
    

