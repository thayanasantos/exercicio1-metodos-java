package br.digital.innovation.one.exercicio.loops;

import java.util.Scanner;

public class Numero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int numero;
        int count = 0;
        int maior = 0;
        int media = 0;
        do {
            System.out.println("numero");
            numero = scan.nextInt();

            media = media + numero;
            if (numero>maior) maior = numero;
            count = count + 1;
        }while (count <5);
        System.out.println("Maior : " + maior);
        System.out.println("a media e :" + (media)/5);
    }
}
