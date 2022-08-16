package br.digital.innovation.one.colection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ExemploListaOrdenada {
    public static void main(String[] args) {

        List<Gato> meusGatos = new ArrayList<>(){{
            add(new Gato("jonh",18,"preto"));
            add(new Gato("simba",6,"tigrado"));
            add(new Gato("jonh",12,"amarelo"));
        }};
        System.out.println(meusGatos);

        System.out.println("Ordem aleatoria: ");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);

        System.out.println("Ordem natural: ");
        Collections.sort(meusGatos);
        System.out.println(meusGatos);

        System.out.println("Ordem idade");
        Collections.sort(meusGatos, new ComparatorIdade());
       // meusGatos.sort(ComparatorIdade);
        System.out.println(meusGatos);

        System.out.println("Ordem cor");
        Collections.sort(meusGatos, new ComparatorCor());
        // meusGatos.sort(ComparatorCor);
        System.out.println(meusGatos);

        System.out.println("Ordem por NomeCorIdade");
        Collections.sort(meusGatos, new NomeCorIdade());
        System.out.println(meusGatos);



    }


    }


class Gato implements Comparable <Gato>{
    private String nome;
    private int idade;
    private String cor;

    public Gato(String nome, int idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cor='" + cor + '\'' +
                '}';
    }


    @Override
    public int compareTo(Gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }

}
class ComparatorIdade implements Comparator <Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        return Integer.compare(g1.getIdade(), g2.getIdade() );
    }
}
class ComparatorCor implements Comparator <Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        return g1.getCor().compareToIgnoreCase(g2.getCor());
    }
}
class NomeCorIdade implements Comparator <Gato>{

    @Override
    public int compare(Gato g1, Gato g2) {
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if(nome!=0) return nome;

        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if(nome!=0) return nome;

        return Integer.compare(g1.getIdade(), g1.getIdade());
    }
}
