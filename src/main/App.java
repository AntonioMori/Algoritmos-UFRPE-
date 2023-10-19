package main;
public class App {

    public static int encontre(int[] arrayOrdenado, int num){
        
        int resposta = 0; // caso base se não encontrar
       
        // começa em 0, vai até o tamanho do array, e incrementa de 1 em 1
        for(int i = 0; i < arrayOrdenado.length; i++){
            
            //se depois de passar por todo arrey achar o num igual vai modificar a resp
            if(arrayOrdenado[i] == num){
                resposta =1;
            
            }
        }
        return resposta;
    }


    public static int maior(int[] arrayDesordenado){
        
    //começa com o primeiro elemento do array sendo o maior
        int maior = arrayDesordenado[0];
        
    //durante todo o array vai se comparar o maior atual com o num referente ao indice
    //verificado. Se o num for maior que o maior atual, o maior atual passa a ser o num
        for(int i = 0; i < arrayDesordenado.length; i++){

            if(arrayDesordenado[i] > maior){
                maior = arrayDesordenado[i];
            }
        }

        return maior; //retorna o resultado
    }


    public static Integer parMaisProximo(Integer[][] pares){
        
        //mesma lógica do maior, mas agora com 2 dimensões
        int menorPar = pares[0][0];
        
        // durante todo o array vai verificar se o primeiro elemento do par é 
        //menor que o menorPar
        for(int i = 0; i < pares.length; i++){
            if(pares[i][0] < menorPar){
                menorPar = pares[i][0];
            }
        }

        
        return menorPar;
    }








}
