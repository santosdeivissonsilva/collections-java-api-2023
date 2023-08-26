package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa> pessoasList;

    public OrdenacaoPessoa() {
        this.pessoasList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoasList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoasList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoasList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();

        ordenacaoPessoa.adicionarPessoa("Paulo", 22, 1.8);
        ordenacaoPessoa.adicionarPessoa("Julia", 15, 1.65);
        ordenacaoPessoa.adicionarPessoa("Maria", 36, 1.68);

        System.out.println(ordenacaoPessoa.pessoasList);
        System.out.println(ordenacaoPessoa.ordenarPorIdade());
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }

}
