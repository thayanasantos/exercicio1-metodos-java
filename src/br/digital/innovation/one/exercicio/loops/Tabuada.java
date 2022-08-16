package br.digital.innovation.one.exercicio.loops;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Tabuada: ");
        int Tabuada = scan.nextInt();

        System.out.println("Tabuada de " + Tabuada);
        for (int i =1;i<=10;i++){
            System.out.println(Tabuada + "X" + i + "=" + (Tabuada*i));
        }
    }
}
