package ordenadores;

public class OrdenarPorContagemSimples implements Ordenador{

    @Override
    public int[] ordene(int[] array) {
        if(array == null || array.length<=1){
            return array;
        }

        int valMax = array[0];
        for(int v = 1; v<array.length;v++){
            if(array[v]> valMax){
                valMax = array[v];
            }
        }
        int[] contador = new int[valMax+1];

        for(int v: array){
            contador[v]++;
        }

        int indice = 0;
        for(int v=0; v< contador.length;v++){
            while(contador[v]>0){
                array[indice++]= v;
                contador[v]--;
            }
        }
        return array;
    }
    
}
