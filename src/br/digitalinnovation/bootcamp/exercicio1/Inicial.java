package br.digitalinnovation.bootcamp.exercicio1;

public class Inicial {
    public static void main(String[] args) {

        System.out.println("Exercicio Calculadora");
        Calculadora.soma(3,4);
        Calculadora.subtracao(3,4);
        Calculadora.multiplicacao(3,4);
        Calculadora.divisao(3,4);

        System.out.println("Exercicio Mensagem");
        Mensagem.obterMensagem(8);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(19);

        System.out.println("Exercicio Emprestimo");
        Emprstimo.calcular(1000,Emprstimo.getDuasParcelas());
        Emprstimo.calcular(1000,Emprstimo.getTresParcelas());
        Emprstimo.calcular(1000,5);
    }
}
