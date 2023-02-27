import javax.swing.*;/**
/**
 * @(#)SUMA_CON_METODO.java
 *
 *
 * @author 
 * @version 1.00 2010/10/19
 */

public class metodos2 {
        
    /*********/
    public static void main(String[] args) {
        // TODO code application logic here
       
    double X,Y,Z=0,K,acu=0,prom=0;
    int j,con=1,edad;
     do{
         j=Entrada("Deme su c�digo... ");
         edad=Entrada("Deme su edad... ");
         X=Entrada1 ("INGRESE nota 1");  //guarde en X el valor que returne del metodo entrada, y envie el mensage 
         Y=Entrada1 ("INGRESE nota 2");
         K=Entrada1 ("INGRESE nota 3");
         Z=calcular(X,Y,K);
         acu=acu+Z;
   //      salida (Z);		 
         salida1("la nota 1 es...",X);
         salida1("El promedio es...",Z);
         salida2("el C�digo es...   ",j);
         con++;
     }while(con<=2);
      prom=calcular1(acu,2);
     salida1("El promedio de los estudiantes (sal�n) es...",prom);
     }
          
    
    static Integer Entrada (String msg)
    {
   	int  a;
       /* a=Double.parseDouble(JOptionPane.showInputDialog(null,msg));
      return a; */
         	
        
        a=Integer.parseInt(JOptionPane.showInputDialog(null,msg));
        return a; 
        
    }
    
    static double  Entrada1 (String msg)
    {
   	double  a;
        a=Double.parseDouble(JOptionPane.showInputDialog(null,msg));
      return a;    	
        
          
      
    }
    static double calcular (double P, double Q, double j)
    {	double c;
   		c=(P+Q+j)/3;
    	return c;
    
    	
    }	
    static double calcular1 (double P, int j)
    {	double c;
   		c=(P/j);
    	return c;
    	
    	
    }	
    static void salida (double msg)
    {
   		JOptionPane.showMessageDialog(null," EL RESULTADO ES " + msg);	
    }
      static void salida1 (String X,double msg)
    {
   		JOptionPane.showMessageDialog(null,X + msg);	
    }   	
           static void salida2 (String X,int msg)
    {
   		JOptionPane.showMessageDialog(null,X + msg);	
    }     

}
       
        
        
    
