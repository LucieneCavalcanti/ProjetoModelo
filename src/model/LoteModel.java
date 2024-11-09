package model;

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
    
}
