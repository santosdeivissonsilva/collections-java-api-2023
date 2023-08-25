package main.java.list.OperacoesBasicas;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompra {
    private List<Item> itemList;

    public CarrinhoDeCompra () { this.itemList = new ArrayList<>(); }

    public void adicionarItem(String nome, double preco, int quantidade){
        itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();
        for(Item i : itemList){
            if(i.getNome().equalsIgnoreCase(nome)){
                itensParaRemover.add(i);
            }
        }
        itemList.removeAll(itensParaRemover);
    }

    public double calcularValorTotal(){
        double valorTotalCarrinho = 0;
        for(Item i : itemList) valorTotalCarrinho += i.getPreco() * i.getQuantidade();
        return valorTotalCarrinho;
    }

    public void exibirItens(){
        System.out.println(itemList);
    }

    public static void main(String[] args) {
        CarrinhoDeCompra carrinhoDeCompra = new CarrinhoDeCompra();
        carrinhoDeCompra.adicionarItem("arroz", 25.50, 1);
        carrinhoDeCompra.adicionarItem("feijao", 7.90, 1);
        carrinhoDeCompra.exibirItens();

        System.out.println("O valor total do Carrinho de Compras é: R$" + carrinhoDeCompra.calcularValorTotal());

        carrinhoDeCompra.removerItem("feijao");
        carrinhoDeCompra.exibirItens();

        System.out.println("O valor total do Carrinho de Compras é: R$" + carrinhoDeCompra.calcularValorTotal());

    }
}
