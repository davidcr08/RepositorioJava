package punto1;

public class Punto1 {
    
    public static void main(String[] args) {
        Punto1 punto1 = new Punto1();
        System.out.println(punto1.suma(5));
    }

    public int suma(int mayor){
        return sumaP(mayor, 0, 0);
    }

    private int sumaP(int mayor, int suma, int numero){
        if(numero<mayor){
            suma += numero;
            return sumaP(mayor, suma, numero+1);
        }else{
            return suma;
        }
    }
}
