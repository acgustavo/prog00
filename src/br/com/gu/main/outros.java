package br.com.gu.main;

import java.util.Arrays;
import java.util.Scanner;

public class outros {
	private static Scanner in;

	public static void main(String[] args) {

		in = new Scanner(System.in);
		int[] valores = new int[7];
		int somaTotal = 0, multTotal = 1, menor=0, maior = 0;

		// recebe os dados
		for (int x = 0; x < 7; x++) {
			System.out.printf("Dig5ite o nume da posicao [%d]: ", x + 1);
			valores[x] = in.nextInt();
		}
		
		//imprime todos os valores digitados, separado por ,
		System.out.println("\n" + Arrays.toString(valores) + "\n");

		// armasena em somaTotal a soma dos dados digitados
		for (int x : valores) {
			somaTotal += x;
		}

		//imprime a toma dos valores digitados
		System.out.println("Soma total dos numeros e: " + somaTotal + "\n");

		//multiplica os valores digitados pelo local armasenado e imprime a multiplicacao
		for (int x = 0; x < 7; x++)
			System.out.printf("Multiplicacao do numero [%d] pelo indice [%d] e: %d\n", valores[x], x, (valores[x] * x));

		//multiplica todos os valores digitados
		for (int x = 0; x < 7; x++)
			multTotal *= valores[x];

		// imprime a multiplicacao entre todos os valores
		System.out.println("\n" + "A soma da multiplicacao do numero pelo indice e: " + multTotal + "\n");

		//imprime a media aritmetica
		System.out.println("A media aritmetica e: " + somaTotal / valores.length + "\n");
		
		//encontrando o menor valor da lista
		for(int x : valores){
			if( x < menor || menor == 0 ){
				menor = x;
			}
		}
		//imprime o menor valor da lista	
		System.out.println("O menor valor digitado e:" + menor);
		
		//encontrando o maior valor da lista
		for(int x : valores){
			if( x > maior){
				maior = x;
			}
		}
		//imprime o maior valor da lista	
		System.out.println("O maior valor digitado e:" + maior);
		
	} 
}