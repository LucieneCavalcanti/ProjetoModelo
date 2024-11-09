package model;

import java.util.Scanner;

public class CategoriaModel implements Cadastro{
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
    @Override
    public void cadastrar() throws Exception {
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
    }
    @Override
    public String mostrar() {
        // TODO Auto-generated method stub
    }

    //sets/gets
    
}
