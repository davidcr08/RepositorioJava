package buses;

public class Buses {
    
    public static void main(String[] args) {
        int[][] buses = {{1,2,3,4,5}, {12,22,33,41,5}, {13,21,3,4,15}, {19,12,3,14,25}, {100,2,30,45,35}};
        Buses buses2 = new Buses();
        for(int i = 0; i<5; i++){
            System.out.println(buses2.identificarDia(buses2.buscarDiaMasPasajeros(buses)[i]));
        }
        for(int i = 1; i<5; i++){
            System.out.println(buses[0][buses2.buscarBusMasPasajeros(buses)[i]]);
        }
    }

    public void insertarDato(int i, int j, int[][] matriz, int dato){
        matriz[i][j] = dato;
    }

    public String identificarDia(int i){
        switch(i){
            case 1:
                return "Lunes";
            case 2:
                return "Martes";
            case 3:
                return "Miercoles";
            case 4:
                return "Jueves";
            default:
                return "Valor incorrecto";
        }
    }

    public int[] buscarDiaMasPasajeros(int[][] array){
        int resultado[] = new int[array.length];
        int max = 0;
        for(int i = 0; i<array.length; i++){
            for(int j = 1; j<array[i].length; j++){
                if(array[j][i] > max){
                    max = array[j][i];
                    resultado[i] = j;
                }
            }
            max = 0;
        }
        return resultado;
    }

    public int[] buscarBusMasPasajeros(int[][] array){
        int resultado[] = new int[array.length];
        int max = 0;
        for(int i = 1; i<array.length; i++){
            for(int j = 0; j<array[i].length; j++){
                if(array[i][j] > max){
                    max = array[i][j];
                    resultado[i] = j;
                }
            }
            max = 0;
        }
        return resultado;
    }
}
