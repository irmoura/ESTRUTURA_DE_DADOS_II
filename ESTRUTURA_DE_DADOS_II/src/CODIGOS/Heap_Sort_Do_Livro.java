/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODIGOS;

import javax.swing.*;//CÓDIGO TIRADO DO LIVRO DA PÁGINA 101(85) À 103(87)

/**
 *
 * @author Mael
 */
public class Heap_Sort_Do_Livro {
    
    //94-72-51-38
    
    static int Quantidade = 4;//QUANTIDADE DE NÚMEROS QUE SERÃO ORDENADOS************* 
                              //SE MAIOR QUE 4 DEVE SE ALTERAR A PARTE DE MOSTRAR OS NUMEROS
    static int X[] = new int[Quantidade+1];
    static String X_String[] = new String[Quantidade+1];
    
    public static void main(String args[]){//INICIO DO MAIN
        int i,qtde;
        // carregando os números no vetor
        for(i = 1; i <= Quantidade; i++){//INICIO FOR QUE CARREGA OS NÚMEROS NO VETOR X
            
            X[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o "+i+"º número: ","Heap Sort",JOptionPane.QUESTION_MESSAGE));
            
        }
        
        for(i = 0; i < (Quantidade+1); i++){
            X_String[i] = ""+X[i];
        }
        
        JOptionPane.showMessageDialog(null,"Números: "+" "+"  "+X_String[1]+" "+X_String[2]+" "+X_String[3]+" "+X_String[4]
                                           +"\nPosição:   0  1   2    3   4","Números a serem ordenados",JOptionPane.INFORMATION_MESSAGE);
        
        //"\nVetor:        0 1 2 3 4"
        //"\nPosição:   0  1   2    3   4" OK COM 2 NUMEROS CADA
        
        //FIM FOR QUE CARREGA OS NÚMEROS NO VETOR X
        //transforma o vetor digitado em um heap
        //cada nó pai é maior que seus filhos
        qtde = Quantidade;
        transforma_heap(qtde);
        //ordenando de forma crescente
        ordena(qtde);
        //mostrando ovetor ordenado
        for(i = 0; i < (Quantidade+1); i++){
            X_String[i] = ""+X[i];
        }
        
        JOptionPane.showMessageDialog(null,"Números: "+"  "+" "+X_String[1]+" "+X_String[2]+" "+X_String[3]+" "+X_String[4]
                                           +"\nPosição:   0  1   2    3   4","Números Ordenados",JOptionPane.INFORMATION_MESSAGE);
        
    }//FIM DO MAIN
    
    public static void transforma_heap(int qtde){//INICIO TRANSFORMA_HEAP
        int i,pai,aux;
        for(i=qtde/2; i >= 1;i--){//INICIO FOR
            heap_fica(i,qtde);
        }//FIM FOR
    }////FIM TRANSFORMA_HEAP
    
    public static void heap_fica(int i, int qtde){//INICIO HEAP_FICA
        int f_esq, f_dir, maior, aux;
        maior = i;
        if(2*i+1 <= qtde){//INICIO IF
            //o nó que está sendo analizado
            //tem filhos para esquerda e direita
            f_esq = 2*i+1;
            f_dir = 2*i;
            if(X[f_esq] >= X[f_dir] && X[f_esq] > X[i])
                maior = 2*i+1;
            else if (X[f_dir] > X[f_esq] && X[f_dir] > X[i])
                maior = 2*i;
        }//FIM IF
        else if (2*i <= qtde){
            //o nó que está sendo analisado
            //tem filhos apenas para a direita
            f_dir = 2*i;
            if(X[f_dir] > X[i])
                maior = 2*i;
        }
        if (maior != i){
            aux = X[i];
            X[i] = X[maior];
            X[maior] = aux;
            heap_fica(maior,qtde);
        }
    }//FIM HEAP_FICA
    
    public static void ordena(int qtde){
        int i, aux = 0, ultima_posi = 0;
        for(i = qtde; i >=2; i--){
            aux = X[1];
            X[1] = X[i];
            X[i] = aux;
            ultima_posi = i - 1;
            heap_fica(1, ultima_posi);
        }
    }
    
}