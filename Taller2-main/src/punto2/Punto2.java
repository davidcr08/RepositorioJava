package punto2;

public class Punto2 {
    
    public static void main(String[] args) {
        Punto2 punto2 = new Punto2();
        punto2.imprimirNumeros(6);
    }

    public void imprimirNumeros(int numeroInicial){
        for(int i = numeroInicial; i>0; i--){
            System.out.println(i);
        }
    }
}
