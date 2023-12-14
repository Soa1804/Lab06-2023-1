package ordenadores;
public class OrdenarQuick implements Ordenador{

    @Override
    public int[] ordene(int[] array) {

        return array;

    }

    public int quickParticio(int[] array, int inicio, int fim){
        int pivo = array[fim];
        int valor = inicio - 1;

        for(int k = inicio; k<fim; k++){
            if(array[k]<= pivo){
                valor++;

                int sec = array[valor+1];
                array[valor+1] = array[fim];
                array[fim] = sec;
            }
        }
        int sec = array[valor+1];
        array[valor+1] = array[fim];
        array[fim] = sec;
        return valor;
    }
    
}
