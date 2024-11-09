package model;

public class ProdutoModel {
    private int id;
    private String descricao;
    private int quantidade;
    private CategoriaModel categoria;
    public ProdutoModel() {
        id = 0;
        descricao = new String();
        quantidade = 0;
        categoria = new CategoriaModel();
    }
    public ProdutoModel(int id, String descricao, int quantidade, CategoriaModel categoria) {
        this.id = id;
        this.descricao = descricao;
        this.quantidade = quantidade;
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
    
    
}
