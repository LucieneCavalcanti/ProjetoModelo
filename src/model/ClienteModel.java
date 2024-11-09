package model;

import java.util.Scanner;

public class ClienteModel implements Cadastro{
    private int id;
    private String nome;
    private String cpf;
    //construtores
    public ClienteModel() {
        id=0;
        nome=new String();
        cpf= new String();
    }
    public ClienteModel(int id, String nome, String cpf) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    @Override
    public void cadastrar() throws Exception {
        Scanner entrada = new Scanner(System.in);
        do {
            System.out.println("Digite o id:");
            id = entrada.nextInt();
        } while (id<=0);
        do {
            System.out.println("Digite o nome:");
            nome = entrada.next();
        } while (nome.length()<3 ||
        nome.length()>100);
        do {
            System.out.println("Digite o cpf:");
            cpf = entrada.next();
        } while (cpf.length()!=14);
    }
    @Override
    public String mostrar() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'mostrar'");
    }

    //sets/gets
    
}
