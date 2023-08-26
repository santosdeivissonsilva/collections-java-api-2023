package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SomaNumeros {
    private List<Integer> numeros = new ArrayList<>();

    public SomaNumeros() {
    }

    public List<Integer> getNumeros() {
        return numeros;
    }

    public void adicionarNumero(int numero) {
        numeros.add(numero);
    }

//    public int calcularSoma(){
//        int soma = 0;
//        for(Integer n : numeros){
//            soma += n;
//        }
//        return soma;
//    }

    public int calcularSoma() {
        int soma = 0;
        Integer numero;
        for (Iterator var2 = this.numeros.iterator(); var2.hasNext(); soma += numero) {
            numero = (Integer) var2.next();
        }
        return soma;
    }

//    public int encontrarMaiorNumero(){
//        int maiorValor = 0;
//        for(Integer n : numeros)
//            if(n > maiorValor){
//                maiorValor = n;
//            }
//        return maiorValor;
//    }

    public int encontrarMaiorNumero() {
        int maiorNumero = Integer.MIN_VALUE;
        if (!this.numeros.isEmpty()) {
            Iterator var2 = this.numeros.iterator();

            while (var2.hasNext()) {
                Integer numero = (Integer) var2.next();
                if (numero >= maiorNumero) {
                    maiorNumero = numero;
                }
            }

            return maiorNumero;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public int encontrarMenorNumero() {
        int menorNumero = Integer.MAX_VALUE;
        if (!this.numeros.isEmpty()) {
            Iterator var2 = this.numeros.iterator();

            while (var2.hasNext()) {
                Integer numero = (Integer) var2.next();
                if (numero <= menorNumero) {
                    menorNumero = numero;
                }
            }
            return menorNumero;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }

    }

    public void exibirNumeros(){
        if (!this.numeros.isEmpty()) {
            System.out.println(this.numeros);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(2);
        somaNumeros.adicionarNumero(8);

        System.out.println("Lista de números adicionados: ");
        somaNumeros.exibirNumeros();
        System.out.println("A soma dos números: " + somaNumeros.calcularSoma());
        System.out.println("O maior número adicionado: " + somaNumeros.encontrarMaiorNumero());
        System.out.println("O menor número adicionado: " + somaNumeros.encontrarMenorNumero());
    }
}


