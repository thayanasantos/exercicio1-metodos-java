package br.digital.innovation.one.exercicio.loops;

import java.util.Scanner;

public class ParEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int qtdnumeros;
        int qtdDePares = 0, qtdDeImpares = 0;
        int count = 0;

        System.out.println("Digite a quantidade de numeros");
        qtdnumeros = scan.nextInt();

        do {
            System.out.println("Digite a quantidade de numeros");
            numero = scan.nextInt();

            if(numero % 2==0) qtdDePares ++;
                else qtdDeImpares++;

            count++;
       }while (count<qtdnumeros);

        System.out.println("Quantidade de Pares: " + qtdDePares );
        System.out.println("Quantidade de Impares: " + qtdDeImpares );

    }
}
