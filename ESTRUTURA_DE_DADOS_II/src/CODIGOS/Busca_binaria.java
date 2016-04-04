/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODIGOS;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author FTN - Alunos
 */
public class Busca_binaria {
    public static void main(String args[]){
        
        int[] X = new int[10];
        int np, i, inicio, fim, meio, achou;
        
        for(i = 0; i < 9; i++){
            /*Random numeros_aleatorios = new Random();
            int na = numeros_aleatorios.nextInt(100);
            X[i] = na;*/
            X[i] = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o "+(i+1)+"º número: "));
        }
        
        np = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o número a ser buscado no vetor: "));
        
        achou = 0;
        inicio = 0;
        fim = 9;
        meio = (inicio+fim)/2;
        
        while(inicio <= fim && achou == 0){
            if(X[meio] == np)
            achou = 1;
            else
            {
                if(np < X[meio])
                    fim = meio -1;
                else
                    inicio = meio + 1;
                    meio = (inicio+fim)/2;
            }
        }
        
        if(achou == 0)
            JOptionPane.showMessageDialog(null,"Número não encontrado no vetor");
        else
            JOptionPane.showMessageDialog(null,"Número encontrado na posição: "+meio);
    }
}
