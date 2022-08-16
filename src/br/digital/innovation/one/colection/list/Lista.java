package br.digital.innovation.one.colection.list;

import java.util.*;

public class Lista {
    public static void main(String[] args) {
        System.out.println("Crie uma lista e adicione sete notas : ");
        List<Double> notas = new ArrayList<Double>();
        notas.add(7.0);
        notas.add(8.5);
        notas.add(9.3);
        notas.add(5.0);
        notas.add(7.0);
        notas.add(0.0);
        notas.add(3.6);
        System.out.println(notas + " ");
        System.out.println(notas.indexOf(5.d));
        System.out.println("Adicione a nota 8 na posicao 4");
        notas.add(4,8.0);

        System.out.println(notas);
        System.out.println("Substitua a nota 5.0 pelo 6.0");
        notas.set(notas.indexOf(5.d),6.0);
        System.out.println(notas);

        System.out.println("Confira se a nota 5d esta na lista: " + notas.contains(5.0));
        System.out.println("Qual a terceira nota adicionada: " + notas.get(2));
        System.out.println(notas.toString());

        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        System.out.println("Exiba a maior nota: " + Collections.max(notas));


        Iterator<Double> iterator = notas.iterator();
        double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;

        }
            System.out.println("Exiba a soma das notas: " + soma);
            System.out.println("Exiba a soma das notas: " + soma/notas.size());
        System.out.println("Remova a nota 0: ");
        notas.remove(0.0);
        System.out.println(notas);

        System.out.println("Remova a nota da posicao  0: ");
        notas.remove (0);
        System.out.println(notas);

        System.out.println("Remova as notas menores que 7: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()){
            Double next = iterator1.next();
            if(next<7) iterator1.remove();

        }
        System.out.println(notas);

        System.out.println("Apague toda a lista: ");
        notas.clear();
        System.out.println(notas);

        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());



    }

}
