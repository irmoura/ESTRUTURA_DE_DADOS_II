/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CODIGOS;

import java.util.Scanner;

/**
 *
 * @author FTN - Alunos
 */
public class Trabalho_02_Maio_2016 {
    
    private static class LISTA
	{
		int num;
		LISTA prox;
	}
    
    public static LISTA inserir(LISTA l, int numero)
	{
		LISTA novo, aux;
		
  		novo = new LISTA();
  		novo.num = numero;
  		novo.prox = null;
  		// inserção no fim da lista
  		if(l == null)
  			l = novo;
  		else{	  
  			aux = l;
  			while(aux.prox != null)
  				aux = aux.prox;
  			aux.prox = novo;
  		}
  		return l;
  	}	
    
    public static void main(String args[]){
        
        // a lista está vazia, logo,
	  	// o objeto início tem o valor null
	  	// o objeto início conterá o endereço 
		// do primeiro elemento da lista
	  	LISTA L1 = null;
	  	// objetos auxiliares
	  	LISTA aux1, aux2;
	  	// variáveis auxiliares
	  	int numero,
	  		ordem;
		Scanner entrada = new Scanner(System.in);
	  	
		System.out.print(" Digite os números da lista (-1 para parar): ");
		numero = entrada.nextInt();
		
	  	while(numero != -1)
                    
        {
	  		L1 = inserir(L1, numero);
	  		// leitura do próximo número
			numero = entrada.nextInt();
	  	}	
	  	if(L1 == null)
	  		System.out.print(" Lista vazia");
	  	else
	  	{
		  	// Verificando se a lista está ordenada crescentemente
		  	ordem = 1;
		  	aux1 = L1;
		  	aux2 = L1.prox;
		  	while(aux1 != null && aux2 != null)
		  	{
		  		if(aux1.num > aux2.num)
		  			ordem = 0;
		  		aux1 = aux2;
		  		aux2 = aux2.prox;
		  	}
		  	if(ordem == 0)
		  	{	// verificando se está ordenada decrescentemente
		  		ordem = 1;
			  	aux1 = L1;
			  	aux2 = L1.prox;
			  	while(aux1 != null && aux2 != null)
			  	{
			  		if(aux1.num < aux2.num)
			  			ordem = 0;
			  		aux1 = aux2;
			  		aux2 = aux2.prox;
			  	}
			  	if(ordem == 1)
			  		System.out.print("\n A lista está ordenada");
			  	else System.out.print("\n A lista não está ordenada");
		  	}
		  	else
		  		System.out.print("\n A lista está ordenada");
	  	}
	}
}