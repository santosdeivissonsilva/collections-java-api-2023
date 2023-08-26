package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros implements Comparable<Integer> {
    private List<Integer> numeros;

    public OrdenacaoNumeros() {
        this.numeros = new ArrayList<>();
    }

    @Override
    public int compareTo(Integer n) {
        return 0;
    }

    public List<Integer> getNumeros() {
        return numeros;
    }

    public void adicionarNumero(int numero) {
        numeros.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> numerosOrdenadosAscendente = new ArrayList<>(numeros);
        Collections.sort(numerosOrdenadosAscendente);
        return numerosOrdenadosAscendente;
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> numerosOrdenadosDescendente = new ArrayList<>(numeros);
        numerosOrdenadosDescendente.sort(Collections.reverseOrder());
        return numerosOrdenadosDescendente;
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.adicionarNumero(5);
        ordenacaoNumeros.adicionarNumero(7);
        ordenacaoNumeros.adicionarNumero(-1);
        ordenacaoNumeros.adicionarNumero(2);

        System.out.println("Lista de números adicionados: " + ordenacaoNumeros.numeros);
        System.out.println("Ordenando de forma ascendente: " + ordenacaoNumeros.ordenarAscendente());
        System.out.println("Ordenando de forma descendente: " + ordenacaoNumeros.ordenarDescendente());
    }
}
