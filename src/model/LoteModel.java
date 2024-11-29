package model;

import java.util.ArrayList;
import java.util.Scanner;

public class LoteModel {
    private int numero;
    private String data;
    private ProdutoModel produto;
    public LoteModel() {
        numero=0;
        data = new String();
        produto = new ProdutoModel();
    }
    public LoteModel(int numero, String data, ProdutoModel produto) {
        this.numero = numero;
        this.data = data;
        this.produto = produto;
    }
public int getNumero() {
    return numero;
}
public void setNumero(int numero) {
    this.numero = numero;
}
public String getData() {
    return data;
}
public void setData(String data) {
    this.data = data;
}
public ProdutoModel getProduto() {
    return produto;
}
public void setProduto(ProdutoModel produto) {
    this.produto = produto;
}
    public void cadastrar(ArrayList<ProdutoModel> listaProdutos){
        Scanner entrada = new Scanner(System.in);
        do {
            System.out.println("Digite o número do lote:");
            numero = entrada.nextInt();
        } while (numero<=0);
        do {
            System.out.println("Digite a data do lote (dd/mm/aaaa):");
            data = entrada.next();
        } while (data.length()!=10);
        System.out.println("---- Escolha um produto ---");
        for (ProdutoModel p : listaProdutos) {
            p.mostrar();
        }
        do{
            System.out.println("Digite o id do produto:");
            int idProduto = entrada.nextInt();
            for (ProdutoModel p : listaProdutos) {
                if(p.getId()==idProduto)
                this.produto = p;
            }
        }while(produto.getId()==0);
    }
    public String mostrar(){
        return "Lote: " + numero + " " + data + "\n\t" + produto.mostrar();
    }
}
