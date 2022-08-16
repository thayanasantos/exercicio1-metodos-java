package br.digital.innovation.one.exercicios.arrays;

public class OrdemInversa {
    public static void main(String[] args) {
        int[] vetor = {7, 5, -15, 20, 25, 50};
        System.out.println("\nvetor: ");
        int count = 0;
        while (count < vetor.length) {

            System.out.print(vetor[count] + " ");
            count ++;
        }
        System.out.println("\nvetor: ");
        for (int i = (vetor.length -1);i>=0; i--){
            System.out.print(vetor[i] + " ");
        }
    }}