package model;

public class CategoriaModel {
    private int id;
    private String descricao;
    //construtores
    public CategoriaModel() {
        id=0;
        descricao = new String();
    }
    public CategoriaModel(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    //sets/gets
    
}
