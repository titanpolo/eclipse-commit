package com.dio;

import java.util.Scanner;

public class Calculadora {

	//Calculator test
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Digite o primeiro valor: ");
		a = scan.nextInt();

		System.out.println("Digite o segundo valor: ");
		b = scan.nextInt();
		
		int soma = somar(a,b);
		int subtracao = subtrair(a, b);
		int multiplicacao = multiplicar(a,b);
		int divisao = divisdir(a, b);
		
		System.out.println("soma: " + soma);
		System.out.println("subtracao: " + subtracao);
		System.out.println("multiplicacao: " + multiplicacao);
		System.out.println("divisao: " + divisao);
		
		
	}
	
	public static int somar(int a, int b) {
		return a+b;
	}

	
	public static int subtrair(int a, int b) {
		return a-b;
	}
	
	public static int divisdir(int a, int b) {
		return a/b;
	}
	
	public static int multiplicar(int a, int b) {
		return a*b;
	}
	
}
