package model;

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
    
}
