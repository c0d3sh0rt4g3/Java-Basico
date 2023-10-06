package Ejercicios06;

public class Ejercicio22 {
    public static int maximoArray(int[] array){
        int maximo = 0;
        for(int i = 0; i<array.length; i++ ) {
            if(array[i]>maximo){
                maximo=array[i];
            }
        }
        return maximo;
    }
    public static void main (String[]args){
        int [] array = new int[5];
        array[0]=3;
        array[1]=2;
        array[2]=0;
        array[3]=5;
        array[4]=1;
        System.out.println(maximoArray(array));
    }
}
