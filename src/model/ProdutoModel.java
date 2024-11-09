package model;

public class ProdutoModel implements Cadastro{
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
    @Override
    public void cadastrar() throws Exception {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'cadastrar'");
    }
    @Override
    public String mostrar() {
       return "Produto:" + id + " - " + descricao +
       "\nQuantidade: " + quantidade + " R$ " + precoVenda +
       "\n" + categoria.mostrar();//ou .getDescricao()
    }
    
    
}
