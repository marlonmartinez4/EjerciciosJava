
package excepciones;


public class PrincipalHilos {
    
    public static void main(String[] args) {
        Proceso1 hilo1=new Proceso1();
        Thread hilo2=new Thread(new Proceso2());
        
        hilo1.start();
        hilo2.start();
      Integer n=new Integer(10);
        System.out.println(Math.ceil(-8.7));
    }
}
