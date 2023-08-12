import Hijo.ScrumMaster;
import Padre.Empleado;

public class Main {

    public static void imprime(Empleado emple){
        System.out.println("Objeto.obtenerDetalles()="+emple.obtenerDetalles());
    }
    
    public static void prueba (int dato){
        System.out.println("nada");

        public static void determinarTipo(Empleado emple){
            if (emple instanceof ScrumMaster){
                System.out.println("Esto viene de ScrumMaster");
            }else if (emple instanceof Empleado){
                System.out.println("Esto viene de empleado");
            }else if (emple instanceof Object){
                System.out.println("es cualquier cosa");

            }
        }

    }
    public static void main(String[] args) {
        Empleado em = new Empleado ("juan",3500);
       System.out.println(em.obtenerDetalles());
        imprime(em);
        ScrumMaster sm = new ScrumMaster("juan",3000,"desarrollo");
        imprime(sm);
        System.out.println (sm.obtenerDetalles());


    }
}