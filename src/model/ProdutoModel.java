package model;

import java.util.ArrayList;
import java.util.Scanner;

public class ProdutoModel {
    private int id;
    private String descricao;
    private int quantidade;
    private float precoVenda;
    private CategoriaModel categoria;
    public ProdutoModel() {
        id = 0;
        descricao = new String();
        quantidade = 0;
        precoVenda = 0;
        categoria = new CategoriaModel();
    }
    public ProdutoModel(int id, String descricao, int quantidade, 
    float precovenda, CategoriaModel categoria) {
        this.id = id;
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.precoVenda = precovenda;
        this.categoria = categoria;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public CategoriaModel getCategoria() {
        return categoria;
    }
    public void setCategoria(CategoriaModel categoria) {
        this.categoria = categoria;
    }

    public void cadastrar(ArrayList<CategoriaModel> categorias) throws Exception {
      Scanner entrada = new Scanner(System.in);
        do {
            System.out.println("Digite o id:");
            id = entrada.nextInt();
        } while (id<=0);
        do {
            System.out.println("Digite a descrição");
            descricao = entrada.next();
        } while (descricao.length()<3 ||
        descricao.length()>50);
        do {
            System.out.println("Digite a quantidade:");
            quantidade = entrada.nextInt();
        } while (quantidade<0);
        do {
            System.out.println("Digite o preço de venda:");
            precoVenda = entrada.nextFloat();
        } while (precoVenda<=0);    
        do {
            System.out.println("Selecione uma categoria");
            System.out.println("Categorias cadastradas");
            for (CategoriaModel c : categorias) {
                System.out.println(c.mostrar());
            }
            System.out.println("Digite o id da categoria:");
            int idCategoria = entrada.nextInt();
            for (CategoriaModel c : categorias) {
                if(idCategoria==c.getId())
                    this.categoria = c;
            }
        } while (categoria.getId()==0);
    }

    public String mostrar() {
       return "Produto:" + id + " - " + descricao +
       "\nQuantidade: " + quantidade + " R$ " + precoVenda +
       "\n" + categoria.mostrar();//ou .getDescricao()
    }
    public float getPrecoVenda() {
        return precoVenda;
    }
    public void setPrecoVenda(float precoVenda) {
        this.precoVenda = precoVenda;
    }
    
    
}
