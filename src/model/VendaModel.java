package model;

import java.util.ArrayList;

public class VendaModel {
    private int id;
    private String data;
    private String formaPagamento;
    private ClienteModel cliente;
    private ArrayList<ItemVenda> itens;
    public VendaModel() {
        id = 0;
        data = new String();
        formaPagamento = new String();
        cliente = new ClienteModel();
        itens = new ArrayList<>();

    }
    public VendaModel(int id, String data, String formaPagamento, ClienteModel cliente, ArrayList<ItemVenda> itens) {
        this.id = id;
        this.data = data;
        this.formaPagamento = formaPagamento;
        this.cliente = cliente;
        this.itens = itens;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public String getFormaPagamento() {
        return formaPagamento;
    }
    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }
    public ClienteModel getCliente() {
        return cliente;
    }
    public void setCliente(ClienteModel cliente) {
        this.cliente = cliente;
    }
    public ArrayList<ItemVenda> getItens() {
        return itens;
    }
    public void setItens(ArrayList<ItemVenda> itens) {
        this.itens = itens;
    }
    
}
