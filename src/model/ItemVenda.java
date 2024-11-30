package model;

import java.util.ArrayList;
import java.util.Scanner;

public class ItemVenda {
    private ProdutoModel produto;
    private int quantidade;
    private float valor;
    public ItemVenda() {
        produto = new ProdutoModel();
        quantidade = 0;
        valor = 0;
    }
    public ItemVenda(ProdutoModel produto, int quantidade, float valor) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.valor = valor;
    }
    public ProdutoModel getProduto() {
        return produto;
    }
    public void setProduto(ProdutoModel produto) {
        this.produto = produto;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public float getValor() {
        return valor;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }
    public void cadastrar(ArrayList<ProdutoModel> listaProdutos){
        do{
            System.out.println("Escolha o produto:");
            for (ProdutoModel p : listaProdutos) {
                System.out.println(p.mostrar());
            }
            Scanner entrada = new Scanner(System.in);
            System.out.println("Digite o id do produto: ");
            int idProduto = entrada.nextInt();
            for (ProdutoModel p : listaProdutos) {
                    if(p.getId()==idProduto){
                        this.produto = p;
                        System.out.println("Digite a quantidade do produto ["+
                        p.getDescricao() + "]");
                        this.quantidade = entrada.nextInt();
                        this.valor = p.getPrecoVenda() + this.quantidade;
                    }
            }
        }while(produto.getId()==0);
    }
}
