package atividade1;

import java.util.*;

public class Main {
	
    static void printArray(int array[])
    {
        int n = array.length;
        for (int i = 0; i < n; ++i)
            System.out.println(i + ": " + array[i] + " ");
  
        System.out.println();
    }
    
    static int[] insertionSort(int array[])
    {
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            int k = array[i];
            int j = i - 1;
  
            while (j >= 0 && array[j] > k) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = k;
        }
        
        return array;
    }
    
	public static void main(String[] args) {
		int[] array500 = new int[500];
		
    	Random aleatorio = new Random();
    	
        for (int i = 0; i < 500; i++){
        	int Number = aleatorio.nextInt(10000 - 1 + 1) + 1;
        	array500[i] = Number;
         }
        
        int[] soArray500 = insertionSort(array500);
        
        printArray(soArray500);
        
        int posElementoSorteado = aleatorio.nextInt(500);
        
        int elementoEscolhido = soArray500[posElementoSorteado];
        
        System.out.println("Elemento sorteado: " + elementoEscolhido);
        
        
        long startBuscaBinaria = System.nanoTime();
        
        Integer posicao = BuscaBinaria.binaria(elementoEscolhido, soArray500);
        
        long fimBuscaBinaria = System.nanoTime();
        
        long totalBuscaBinaria = fimBuscaBinaria - startBuscaBinaria;
        
        long startBuscaSequencial = System.nanoTime();
        
        int quantidadeElementos = Sequencial.linear(elementoEscolhido, soArray500);
        
        long fimBuscaSequencial = System.nanoTime();
        
        long totalBuscaSequencial = fimBuscaSequencial  - startBuscaSequencial;
  
        long tempoTotalBuscas = fimBuscaSequencial - startBuscaBinaria;
        
        long percentBuscaBinaria = (totalBuscaBinaria * 100) / tempoTotalBuscas;
        
        long percentBuscaSequencial = (totalBuscaSequencial * 100) / tempoTotalBuscas;
        
        
        System.out.println("Posição elemento sorteado: " + posicao);

        System.out.println("Quantidade de elementos iguais a " + elementoEscolhido + " é de: " + quantidadeElementos);
        
        System.out.println("Tempo total buscas em nano secundos: " + tempoTotalBuscas);
        
        System.out.println("Tempo total busca binária em nano secundos: " + totalBuscaBinaria + " (" + percentBuscaBinaria + "%)");
        
        System.out.println("Tempo total busca sequencial em nano secundos: " + totalBuscaSequencial + " (" + percentBuscaSequencial + "%)");
                
        
	}
}
