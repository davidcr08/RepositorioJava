import java.io.*;
import javax.swing.JOptionPane;
import java.lang.*;


public class alumnos {
        
  
    public static void main(String[] args) {
       
       
       Enlaces union;//instancio a la clase Enlaces por medio de la variable union
       union=new Enlaces();//creo el obejo para llamar los métodos de la clase Enlaces
       
       int i=0,j=0,d=0;
       double grup=0,alum=0,mater=0,cal1=0,cal2=0,cal3=0,acu1=0,acu2=0,acu3=0,pro=0,proal=0,progrup=0,progrut=0;
       
       grup=union.conector_double("CUANTOS GRUPOS EXISTEN EN LA INSTITUCION");
       //grup=Double.parseDouble(JOptionPane.showInputDialog(null,"CUANTOS GRUPOS EXISTEN EN LA INSTITUCION"));
       for (i=1;i<=grup;i++)
       {
        //union.conector_double con esta instrucción llamo cualquier método de la clase Enlaces
 	//donde union es el objeto que une las clases y conector_double es el metodo que puede tener cualquier nombre

       	alum=union.conector_double("CON CUANTOS ALUMNOS CUENTA ESTE GRUPO");
       	
       	for (j=1;j<=alum;j++)
       	{
       		mater=union.conector_double("CAUNTAS MATERIAS CURSA EL ALUMNO");
       		
       		for (d=1;d<=mater;d++)
       		{
       			cal1=union.conector_double("INGRESE LA PRIMER NOTA");
       			cal2=union.conector_double("INGRESE LA SEGUNDA NOTA");
       			cal3=union.conector_double("INGRESE LA TERCER NOTA");
       			
       			pro=(cal1+cal2+cal3)/3;//***********************
       		    acu1=acu1+pro;  			
       		}
       		proal=acu1/mater;//*********************+
       		acu2=acu2+proal;
       		union.salida("EL PROMEDIO DEL ALUMNO ES:  ",proal);
       	}
         progrup=acu2/alum; /*****************
         	acu3=acu3+progrup;  
         	union.salida("EL GUPO TIENE UN PROMEDIO DE:  ",progrup);//Aquí llamo el método salida 
       	}
       	 progrut=acu3/grup;/***********************
       	 union.salida("EL PROMEDIO DE LA INSTITUCION ES DE:  ",progrut);     
    }
}
