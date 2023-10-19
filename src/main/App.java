package main;
public class App {

    public static int encontre(int[] arrayOrdenado, int num){
        
        int resposta = 0;
       
        for(int i = 0; i < arrayOrdenado.length; i++){
            if(arrayOrdenado[i] == num){
                resposta =1;
            
            }
        }
        return resposta;
    }


    //função que divide o array em dois


    public static int maior(int[] arrayDesordenado){
                
        int maior = arrayDesordenado[0];
        
        for(int i = 0; i < arrayDesordenado.length; i++){

            if(arrayDesordenado[i] > maior){
                maior = arrayDesordenado[i];
            }
        }
        return maior;
    }


    public static Integer parMaisProximo(Integer[][] pares){
        return 1;
    }








}
