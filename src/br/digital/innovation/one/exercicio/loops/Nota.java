package br.digital.innovation.one.exercicio.loops;

import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nota;
        System.out.println("Digite uma nota valida");
        nota = scan.nextInt();
        while (nota<0 | nota>10){
            System.out.println("Nota Invalida! Digite Novamente");
            nota = scan.nextInt();
        }
        System.out.println("nota aceita");

    }
}
