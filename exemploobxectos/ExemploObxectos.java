
package exemploobxectos;

public class ExemploObxectos {

 
    public static void main(String[] args) {
        
        // instanciamos un obxecto
   
        Alumno pepito=new Alumno();
        pepito.darNota(7);
        int valorNota=pepito.devolverNota();
        System.out.println("pepito ten un "+valorNota);
        pepito.darNota(valorNota);

                           
    }
    
}
